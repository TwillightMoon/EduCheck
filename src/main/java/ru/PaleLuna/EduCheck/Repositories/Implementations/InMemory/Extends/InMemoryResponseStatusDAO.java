package ru.PaleLuna.EduCheck.Repositories.Implementations.InMemory.Extends;

import org.springframework.stereotype.Repository;
import ru.PaleLuna.EduCheck.Model.Extends.ResponseStatus;
import ru.PaleLuna.EduCheck.Repositories.Implementations.InMemory.InMemoryDAO;

@Repository
public class InMemoryResponseStatusDAO extends InMemoryDAO<ResponseStatus> {
}
