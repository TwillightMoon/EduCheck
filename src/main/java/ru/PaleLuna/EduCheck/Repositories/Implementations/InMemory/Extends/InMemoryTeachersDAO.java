package ru.PaleLuna.EduCheck.Repositories.Implementations.InMemory.Extends;

import org.springframework.stereotype.Repository;
import ru.PaleLuna.EduCheck.Model.Extends.Teacher;
import ru.PaleLuna.EduCheck.Repositories.Implementations.InMemory.InMemoryDAO;

@Repository
public class InMemoryTeachersDAO extends InMemoryDAO<Teacher> {
}
