package ru.PaleLuna.EduCheck.Services.Implementations.Extends;

import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.Student;
import ru.PaleLuna.EduCheck.Repositories.Implementations.Extends.InMemoryStudentsDAO;
import ru.PaleLuna.EduCheck.Services.Implementations.ServiceUnit;

@Service
public class StudentService extends ServiceUnit<Student> {
    public StudentService(InMemoryStudentsDAO _repos) {
        super(_repos);
    }
}
