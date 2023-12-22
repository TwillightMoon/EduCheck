package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InMemory;

import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.Student;
import ru.PaleLuna.EduCheck.Repositories.Implementations.InMemory.Extends.InMemoryStudentsDAO;
import ru.PaleLuna.EduCheck.Services.Implementations.InMemoryServiceUnit;

@Service
public class InMemoryStudentService extends InMemoryServiceUnit<Student> {
    public InMemoryStudentService(InMemoryStudentsDAO _repos) {
        super(_repos);
    }
}
