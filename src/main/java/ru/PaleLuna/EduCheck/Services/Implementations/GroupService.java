package ru.PaleLuna.EduCheck.Services.Implementations;

import ru.PaleLuna.EduCheck.Model.Group;
import ru.PaleLuna.EduCheck.Repositories.Implementations.InMemoryDAO;

public class GroupService extends ServiceUnit<Group>{

    public GroupService(InMemoryDAO<Group> _repos) {
        super(_repos);
    }
}
