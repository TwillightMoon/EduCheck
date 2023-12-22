package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InMemory;

import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.Discipline;
import ru.PaleLuna.EduCheck.Repositories.Implementations.InMemory.Extends.InMemoryDisciplinesDAO;
import ru.PaleLuna.EduCheck.Services.Implementations.InMemoryServiceUnit;

@Service
public class DisciplineService extends InMemoryServiceUnit<Discipline> {
    public DisciplineService(InMemoryDisciplinesDAO _repos) {
        super(_repos);
    }
}
