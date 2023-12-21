package ru.PaleLuna.EduCheck.Services.Implementations.Extends;

import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.Teacher;
import ru.PaleLuna.EduCheck.Repositories.Implementations.Extends.InMemoryTeachersDAO;
import ru.PaleLuna.EduCheck.Services.Implementations.ServiceUnit;

@Service
public class TeacherService extends ServiceUnit<Teacher> {
    public TeacherService(InMemoryTeachersDAO _repos) {
        super(_repos);
    }
}
