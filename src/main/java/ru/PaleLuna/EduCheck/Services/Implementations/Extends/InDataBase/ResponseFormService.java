package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InDataBase;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.ResponseForm;
import ru.PaleLuna.EduCheck.Model.Extends.Task;
import ru.PaleLuna.EduCheck.Model.Extends.Teacher;
import ru.PaleLuna.EduCheck.Repositories.DBRepos.IResponseFormRepos;
import ru.PaleLuna.EduCheck.Services.Implementations.EntityService;

@Service
@Primary
public class ResponseFormService extends EntityService<ResponseForm> {

    private final TeacherService teacherService;
    private final TaskService taskService;
    public ResponseFormService(IResponseFormRepos _repos,
                               TeacherService teacherService,
                               TaskService taskService
                               ) {
        super(_repos);
        this.teacherService = teacherService;
        this.taskService = taskService;
    }

    @Override
    public ResponseForm Save(ResponseForm responseForm){
        if(TryCheckTeacherHasDiscipline(responseForm))
            return _repos.save(responseForm);

        throw new IllegalArgumentException("Учитель не ведет указанную дисциплину");
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
}
