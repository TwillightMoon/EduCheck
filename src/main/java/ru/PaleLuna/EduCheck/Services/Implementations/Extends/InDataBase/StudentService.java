package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InDataBase;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.Student;
import ru.PaleLuna.EduCheck.Model.Extends.User;
import ru.PaleLuna.EduCheck.Repositories.DBRepos.IStudentRepos;
import ru.PaleLuna.EduCheck.Repositories.IEntityRepos;
import ru.PaleLuna.EduCheck.Services.Implementations.EntityService;

@Service
@Primary
public class StudentService extends EntityService<Student> {
    private final UserService userService;

    public StudentService(IStudentRepos _repos, UserService userService)
    {
        super(_repos);
        this.userService = userService;
    }

    @Override
    public Student Save(Student student){
        User user = student.getUser();

        userService.Save(user);

       return super.Save(student);
    }

    public User GetUserByLogin(String login){
        return userService.FindByLogin(login);
    }
}
