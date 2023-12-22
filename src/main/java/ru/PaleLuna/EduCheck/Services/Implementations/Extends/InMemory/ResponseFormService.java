package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InMemory;

import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.ResponseForm;
import ru.PaleLuna.EduCheck.Repositories.Implementations.InMemory.Extends.InMemoryResponseFormDAO;
import ru.PaleLuna.EduCheck.Services.Implementations.InMemoryServiceUnit;

@Service
public class ResponseFormService extends InMemoryServiceUnit<ResponseForm> {
    public ResponseFormService(InMemoryResponseFormDAO _repos) {
        super(_repos);
    }
}
