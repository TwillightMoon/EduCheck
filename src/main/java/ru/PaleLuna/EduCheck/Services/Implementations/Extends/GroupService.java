package ru.PaleLuna.EduCheck.Services.Implementations.Extends;

import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.Group;
import ru.PaleLuna.EduCheck.Repositories.Implementations.Extends.InMemoryGroupsDAO;
import ru.PaleLuna.EduCheck.Services.Implementations.ServiceUnit;

@Service
public class GroupService extends ServiceUnit<Group> {

    public GroupService(InMemoryGroupsDAO _repos) {
        super(_repos);
    }
}
