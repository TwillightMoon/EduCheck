package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InMemory;

import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.Group;
import ru.PaleLuna.EduCheck.Repositories.Implementations.InMemory.Extends.InMemoryGroupsDAO;
import ru.PaleLuna.EduCheck.Services.Implementations.InMemoryServiceUnit;

@Service
public class InMemoryGroupService extends InMemoryServiceUnit<Group> {

    public InMemoryGroupService(InMemoryGroupsDAO _repos) {
        super(_repos);
    }
}
