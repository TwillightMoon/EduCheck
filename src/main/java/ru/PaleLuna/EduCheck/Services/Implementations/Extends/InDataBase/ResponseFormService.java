package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InDataBase;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.ResponseForm;
import ru.PaleLuna.EduCheck.Model.Extends.Task;
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
        Task task = taskService.FindByID(responseForm.getTask().getId());
        Long teacherId = responseForm.getTeacher().getId();
        Long disciplineId = task.getDiscipline().getId();

        if(teacherService.IsHasDiscipline(teacherId, disciplineId)){
            return _repos.save(responseForm);
        }

        throw new IllegalArgumentException("Учитель не ведет указанную дисциплину");
    }
}
