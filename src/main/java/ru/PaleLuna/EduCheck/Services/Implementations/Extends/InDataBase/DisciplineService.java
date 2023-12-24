package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InDataBase;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.Discipline;
import ru.PaleLuna.EduCheck.Model.Extends.Teacher;
import ru.PaleLuna.EduCheck.Repositories.DBRepos.IDisciplineRepos;
import ru.PaleLuna.EduCheck.Services.Implementations.EntityService;

@Service
@Primary
public class DisciplineService extends EntityService<Discipline> {
    public DisciplineService(IDisciplineRepos _repos) {
        super(_repos);
    }

    @Override
    public boolean DeleteByID(Long id){
        Discipline discipline = _repos.findById(id).orElse(null);

        if (discipline == null)
            return false;
        // Удаление дисциплины из списков учителей
        for (Teacher teacher : discipline.getTeachers()) {
            teacher.getDisciplines().remove(discipline);
        }

        // Удаление дисциплины из базы данных
        return super.DeleteByID(id);
    }
}
