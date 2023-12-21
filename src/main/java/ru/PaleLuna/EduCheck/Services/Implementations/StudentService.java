package ru.PaleLuna.EduCheck.Services.Implementations;

import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Student;
import ru.PaleLuna.EduCheck.Repositories.Implementations.InMemoryStudentsDAO;

@Service
public class StudentService extends ServiceUnit<Student> {
    public StudentService(InMemoryStudentsDAO _repos) {
        super(_repos);
    }
}
