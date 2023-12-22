package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InMemory;

import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.Teacher;
import ru.PaleLuna.EduCheck.Repositories.Implementations.InMemory.Extends.InMemoryTeachersDAO;
import ru.PaleLuna.EduCheck.Services.Implementations.InMemoryServiceUnit;

@Service
public class TeacherService extends InMemoryServiceUnit<Teacher> {
    public TeacherService(InMemoryTeachersDAO _repos) {
        super(_repos);
    }
}
