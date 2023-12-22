package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InMemory;

import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.ResponseStatus;

import ru.PaleLuna.EduCheck.Repositories.Implementations.InMemory.Extends.InMemoryResponseStatusDAO;
import ru.PaleLuna.EduCheck.Services.Implementations.InMemoryServiceUnit;

@Service
public class InMemoryResponseStatusService extends InMemoryServiceUnit<ResponseStatus> {
    public InMemoryResponseStatusService(InMemoryResponseStatusDAO _repos) {
        super(_repos);
    }
}
