package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InDataBase;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.*;
import ru.PaleLuna.EduCheck.Repositories.DBRepos.IResponseFormRepos;
import ru.PaleLuna.EduCheck.Services.Implementations.EntityService;

import java.util.List;

@Service
@Primary
public class ResponseFormService extends EntityService<ResponseForm> {

    private final IResponseFormRepos _repos;
    private final TeacherService teacherService;
    private final TaskService taskService;
    private final StudentService studentService;
    private final ResponseStatusService statusService;

    public ResponseFormService(IResponseFormRepos repos,
                               TeacherService teacherService,
                               TaskService taskService,
                               ResponseStatusService statusService,
                               StudentService studentService
                               ) {
        super(repos);
        this._repos = repos;
        this.teacherService = teacherService;
        this.taskService = taskService;
        this.studentService = studentService;
        this.statusService = statusService;
    }

    @Override
    public ResponseForm Save(ResponseForm responseForm){
        if(TryCheckTeacherHasDiscipline(responseForm) && TryCheckTeacherHasGroup(responseForm))
            return _repos.save(responseForm);

        return null;
    }


    public List<ResponseForm> GetResFormsByStatusForTeach(Long idStatus, Long idTeacher){
        return _repos.getResponseFormsByStatusForTeacher(idTeacher, idStatus);
    }
    public List<ResponseForm> GetResFormsForTeach(Long idStatus, Long idTeacher){
        return _repos.getResponseFormsForTeacher(idTeacher);
    }

    public boolean UpdateMark(Long idTeacher, Long idResForm, int mark){
        ResponseForm responseForm = _repos.findEntityById(idResForm);
        if(responseForm.getTeacher().getId() != idTeacher)
            return false;

        responseForm.setMark(mark);
        responseForm.setStatus(statusService.FindByID(3L));

        _repos.save(responseForm);
        return true;
    }

    private boolean TryCheckTeacherHasDiscipline(ResponseForm responseForm){
        Teacher teacher = responseForm.getTeacher();
        if(teacher == null)
            return true;

        Task task = taskService.FindByID(responseForm.getTask().getId());
        Long teacherId = teacher.getId();
        Long disciplineId = task.getDiscipline().getId();

        return teacherService.IsHasDiscipline(teacherId, disciplineId);
    }
    private boolean TryCheckTeacherHasGroup(ResponseForm responseForm){
        Teacher teacher = responseForm.getTeacher();
        if(teacher == null)
            return true;

        Student student = studentService.FindByID(responseForm.getStudent().getId());
        Long teacherId = teacher.getId();
        Long groupId = student.getGroup().getId();

        return teacherService.IsHasGroup(teacherId, groupId);
    }
}
