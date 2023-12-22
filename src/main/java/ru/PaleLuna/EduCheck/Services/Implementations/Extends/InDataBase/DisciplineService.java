package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InDataBase;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.Discipline;
import ru.PaleLuna.EduCheck.Repositories.DBRepos.IDisciplineRepos;
import ru.PaleLuna.EduCheck.Services.Implementations.EntityService;

@Service
@Primary
public class DisciplineService extends EntityService<Discipline> {
    public DisciplineService(IDisciplineRepos _repos) {
        super(_repos);
    }
}
