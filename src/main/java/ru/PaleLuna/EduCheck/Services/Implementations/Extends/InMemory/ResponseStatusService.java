package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InMemory;

import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.ResponseStatus;

import ru.PaleLuna.EduCheck.Repositories.Implementations.InMemory.Extends.InMemoryResponseStatusDAO;
import ru.PaleLuna.EduCheck.Services.Implementations.InMemoryServiceUnit;

@Service
public class ResponseStatusService extends InMemoryServiceUnit<ResponseStatus> {
    public ResponseStatusService(InMemoryResponseStatusDAO _repos) {
        super(_repos);
    }
}
