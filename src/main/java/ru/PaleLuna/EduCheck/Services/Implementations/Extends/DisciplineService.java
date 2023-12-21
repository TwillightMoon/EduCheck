package ru.PaleLuna.EduCheck.Services.Implementations.Extends;

import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.Discipline;
import ru.PaleLuna.EduCheck.Repositories.Implementations.Extends.InMemoryDisciplinesDAO;
import ru.PaleLuna.EduCheck.Services.Implementations.ServiceUnit;

@Service
public class DisciplineService extends ServiceUnit<Discipline> {
    public DisciplineService(InMemoryDisciplinesDAO _repos) {
        super(_repos);
    }
}
