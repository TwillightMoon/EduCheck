package ru.PaleLuna.EduCheck.Services.Implementations.Extends;

import ru.PaleLuna.EduCheck.Model.Extends.Task;
import ru.PaleLuna.EduCheck.Repositories.Implementations.Extends.InMemoryTaskDAO;
import ru.PaleLuna.EduCheck.Services.Implementations.ServiceUnit;

public class TaskService extends ServiceUnit<Task> {
    public TaskService(InMemoryTaskDAO _repos) {
        super(_repos);
    }
}
