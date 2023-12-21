package ru.PaleLuna.EduCheck.Services.Implementations;

import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Group;
import ru.PaleLuna.EduCheck.Repositories.Implementations.InMemoryDAO;
import ru.PaleLuna.EduCheck.Repositories.Implementations.InMemoryGroupsDAO;

@Service
public class GroupService extends ServiceUnit<Group>{

    public GroupService(InMemoryGroupsDAO _repos) {
        super(_repos);
    }
}
