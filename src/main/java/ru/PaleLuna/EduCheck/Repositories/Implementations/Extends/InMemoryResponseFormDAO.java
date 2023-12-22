package ru.PaleLuna.EduCheck.Repositories.Implementations.Extends;

import org.springframework.stereotype.Repository;
import ru.PaleLuna.EduCheck.Model.Extends.ResponseForm;
import ru.PaleLuna.EduCheck.Repositories.Implementations.InMemoryDAO;

@Repository
public class InMemoryResponseFormDAO extends InMemoryDAO<ResponseForm> {
}
