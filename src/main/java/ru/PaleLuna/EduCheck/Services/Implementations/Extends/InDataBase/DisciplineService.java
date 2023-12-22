package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InDataBase;

import ru.PaleLuna.EduCheck.Model.Extends.Discipline;
import ru.PaleLuna.EduCheck.Repositories.DBRepos.IDisciplineRepos;
import ru.PaleLuna.EduCheck.Services.Implementations.EntityService;

public class DisciplineService extends EntityService<Discipline> {
    public DisciplineService(IDisciplineRepos _repos) {
        super(_repos);
    }
}
