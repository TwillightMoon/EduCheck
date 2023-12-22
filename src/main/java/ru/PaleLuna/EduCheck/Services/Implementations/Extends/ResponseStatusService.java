package ru.PaleLuna.EduCheck.Services.Implementations.Extends;

import ru.PaleLuna.EduCheck.Model.Extends.ResponseStatus;

import ru.PaleLuna.EduCheck.Repositories.Implementations.Extends.InMemoryResponseStatusDAO;
import ru.PaleLuna.EduCheck.Services.Implementations.ServiceUnit;

public class ResponseStatusService extends ServiceUnit<ResponseStatus> {
    public ResponseStatusService(InMemoryResponseStatusDAO _repos) {
        super(_repos);
    }
}
