package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InDataBase;

import ru.PaleLuna.EduCheck.Model.Extends.Task;
import ru.PaleLuna.EduCheck.Repositories.DBRepos.ITaskRepos;
import ru.PaleLuna.EduCheck.Services.Implementations.EntityService;

public class TaskService extends EntityService<Task> {
    public TaskService(ITaskRepos _repos) {
        super(_repos);
    }
}
