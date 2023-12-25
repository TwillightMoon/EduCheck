package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InDataBase;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.Student;
import ru.PaleLuna.EduCheck.Model.Extends.Teacher;
import ru.PaleLuna.EduCheck.Model.Extends.User;
import ru.PaleLuna.EduCheck.Repositories.DBRepos.ITeacherRepos;
import ru.PaleLuna.EduCheck.Services.Implementations.EntityService;

@Service
@Primary
public class TeacherService extends EntityService<Teacher> {
    private final UserService userService;

    public TeacherService(ITeacherRepos _repos, UserService userService)
    {
        super(_repos);
        this.userService = userService;
    }

    @Override
    public Teacher Save(Teacher teacher){
        User user = teacher.getUser();

        userService.Save(user);

        return super.Save(teacher);
    }

    public User GetUserByLogin(String login){
        return userService.FindByLogin(login);
    }

    public boolean IsHasDiscipline(Long teacherId, Long disciplineId){
        Teacher teacher = _repos.findEntityById(teacherId);

        return teacher.getDisciplines().
                stream().
                filter(element -> element.getId() == disciplineId)
                .findFirst()
                .orElse(null) != null;
    }
    public boolean IsHasGroup(Long teacherId, Long groupId){
        Teacher teacher = _repos.findEntityById(teacherId);

        return teacher.getGroups().
                stream().
                filter(element -> element.getId() == groupId)
                .findFirst()
                .orElse(null) != null;
    }
}
