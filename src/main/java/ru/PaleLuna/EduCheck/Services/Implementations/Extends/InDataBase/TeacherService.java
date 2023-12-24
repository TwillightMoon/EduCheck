package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InDataBase;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.Teacher;
import ru.PaleLuna.EduCheck.Repositories.DBRepos.ITeacherRepos;
import ru.PaleLuna.EduCheck.Services.Implementations.EntityService;

@Service
@Primary
public class TeacherService extends EntityService<Teacher> {
    public TeacherService(ITeacherRepos _repos) {
        super(_repos);
    }
    public boolean IsHasDiscipline(Long teacherId, Long disciplineId){
        Teacher teacher = _repos.findEntityById(teacherId);

        return teacher.getDisciplines().
                stream().
                filter(element -> element.getId() == disciplineId)
                .findFirst()
                .orElse(null) != null;
    }
}
