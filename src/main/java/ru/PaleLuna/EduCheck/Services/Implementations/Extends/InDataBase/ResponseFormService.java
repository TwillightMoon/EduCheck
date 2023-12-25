package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InDataBase;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Config.UserDetails;
import ru.PaleLuna.EduCheck.Model.Extends.*;
import ru.PaleLuna.EduCheck.Repositories.DBRepos.IResponseFormRepos;
import ru.PaleLuna.EduCheck.Services.Implementations.EntityService;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

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


    public List<ResponseForm> GetResFormsByStatusForTeach(Long idStatus, UserDetails userDetails){
        Long idTeacher = teacherService.GetUserByLogin(userDetails.getUsername()).getId();

        return _repos.getResponseFormsByStatusForTeacher(idTeacher, idStatus);
    }
    public List<ResponseForm> GetResFormsForTeach(UserDetails userDetails){
        Long idTeacher = teacherService.GetUserByLogin(userDetails.getUsername()).getId();

        return _repos.getResponseFormsForTeacher(idTeacher);
    }

    public boolean UpdateMark(UserDetails userDetails, Long idResForm, int mark){
        Long idTeacher = teacherService.GetUserByLogin(userDetails.getUsername()).getId();

        ResponseForm responseForm = _repos.findEntityById(idResForm);

        if(!Objects.equals(responseForm.getTeacher().getId(), idTeacher)
                || responseForm.getStatus().getId() < 2)
            return false;

        responseForm.setMark(mark);
        responseForm.setStatus(statusService.FindByID(3L));

        _repos.save(responseForm);
        return true;
    }

    public boolean UploadAnswer(UserDetails userDetails, Long idResForm){
        Long idStudent = studentService.GetUserByLogin(userDetails.getUsername()).getId();

        ResponseForm responseForm = _repos.findEntityById(idResForm);

        if(!Objects.equals(responseForm.getStudent().getId(), idStudent))
            return false;

        responseForm.setStatus(statusService.FindByID(2L));
        responseForm.setUploadDate(LocalDate.now());

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
