package ru.PaleLuna.EduCheck.Repositories.Implementations;

import org.springframework.stereotype.Repository;
import ru.PaleLuna.EduCheck.Model.Student;

@Repository
public class InMemoryStudentsDAO extends InMemoryDAO<Student> {
}
