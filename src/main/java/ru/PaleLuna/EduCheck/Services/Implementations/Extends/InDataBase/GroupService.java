package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InDataBase;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.Discipline;
import ru.PaleLuna.EduCheck.Model.Extends.Group;
import ru.PaleLuna.EduCheck.Model.Extends.Teacher;
import ru.PaleLuna.EduCheck.Repositories.DBRepos.IGroupRepos;
import ru.PaleLuna.EduCheck.Services.Implementations.EntityService;

@Service
@Primary
public class GroupService extends EntityService<Group> {
    public GroupService(IGroupRepos _repos) {
        super(_repos);
    }

    @Override
    public boolean DeleteByID(Long id){
        Group group = _repos.findById(id).orElse(null);

        if (group == null)
            return false;
        // Удаление дисциплины из списков учителей
        for (Teacher teacher : group.getTeachers()) {
            teacher.getGroups().remove(group);
        }

        // Удаление дисциплины из базы данных
        return super.DeleteByID(id);
    }
}
