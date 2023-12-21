package ru.PaleLuna.EduCheck.Repositories.Implementations.Extends;

import org.springframework.stereotype.Repository;
import ru.PaleLuna.EduCheck.Model.Extends.Teacher;
import ru.PaleLuna.EduCheck.Repositories.Implementations.InMemoryDAO;

@Repository
public class InMemoryTeachersDAO extends InMemoryDAO<Teacher> {
}
