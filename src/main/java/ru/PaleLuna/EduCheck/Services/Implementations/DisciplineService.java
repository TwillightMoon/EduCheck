package ru.PaleLuna.EduCheck.Services.Implementations;

import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Discipline;
import ru.PaleLuna.EduCheck.Repositories.Implementations.InMemoryDisciplinesDAO;

@Service
public class DisciplineService extends ServiceUnit<Discipline> {
    public DisciplineService(InMemoryDisciplinesDAO _repos) {
        super(_repos);
    }
}
