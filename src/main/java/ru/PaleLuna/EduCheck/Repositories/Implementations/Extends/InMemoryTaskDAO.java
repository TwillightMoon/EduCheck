package ru.PaleLuna.EduCheck.Repositories.Implementations.Extends;

import org.springframework.stereotype.Repository;
import ru.PaleLuna.EduCheck.Model.Extends.Task;
import ru.PaleLuna.EduCheck.Repositories.Implementations.InMemoryDAO;

@Repository
public class InMemoryTaskDAO extends InMemoryDAO<Task> {
}
