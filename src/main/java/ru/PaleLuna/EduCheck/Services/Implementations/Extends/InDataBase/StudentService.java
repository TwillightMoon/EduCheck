package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InDataBase;

import ru.PaleLuna.EduCheck.Model.Extends.Student;
import ru.PaleLuna.EduCheck.Repositories.DBRepos.IStudentRepos;
import ru.PaleLuna.EduCheck.Repositories.IEntityRepos;
import ru.PaleLuna.EduCheck.Services.Implementations.EntityService;

public class StudentService extends EntityService<Student> {
    public StudentService(IStudentRepos _repos) {
        super(_repos);
    }
}
