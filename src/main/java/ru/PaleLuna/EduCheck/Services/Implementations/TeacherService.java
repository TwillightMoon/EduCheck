package ru.PaleLuna.EduCheck.Services.Implementations;

import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Teacher;
import ru.PaleLuna.EduCheck.Repositories.Implementations.InMemoryTeachersDAO;

@Service
public class TeacherService extends ServiceUnit<Teacher>{
    public TeacherService(InMemoryTeachersDAO _repos) {
        super(_repos);
    }
}
