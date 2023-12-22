package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InDataBase;

import ru.PaleLuna.EduCheck.Model.Extends.Group;
import ru.PaleLuna.EduCheck.Repositories.DBRepos.IGroupRepos;
import ru.PaleLuna.EduCheck.Services.Implementations.EntityService;

public class GroupService extends EntityService<Group> {
    public GroupService(IGroupRepos _repos) {
        super(_repos);
    }
}
