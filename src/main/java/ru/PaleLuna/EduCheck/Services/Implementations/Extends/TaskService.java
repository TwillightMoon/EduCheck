package ru.PaleLuna.EduCheck.Services.Implementations.Extends;

import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.Task;
import ru.PaleLuna.EduCheck.Repositories.Implementations.Extends.InMemoryTaskDAO;
import ru.PaleLuna.EduCheck.Services.Implementations.ServiceUnit;

@Service
public class TaskService extends ServiceUnit<Task> {
    public TaskService(InMemoryTaskDAO _repos) {
        super(_repos);
    }
}
