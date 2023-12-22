package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InMemory;

import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.Task;
import ru.PaleLuna.EduCheck.Repositories.Implementations.InMemory.Extends.InMemoryTaskDAO;
import ru.PaleLuna.EduCheck.Services.Implementations.InMemoryServiceUnit;

@Service
public class InMemoryTaskService extends InMemoryServiceUnit<Task> {
    public InMemoryTaskService(InMemoryTaskDAO _repos) {
        super(_repos);
    }
}
