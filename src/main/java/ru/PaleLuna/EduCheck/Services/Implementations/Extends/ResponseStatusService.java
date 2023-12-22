package ru.PaleLuna.EduCheck.Services.Implementations.Extends;

import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.ResponseStatus;

import ru.PaleLuna.EduCheck.Repositories.Implementations.Extends.InMemoryResponseStatusDAO;
import ru.PaleLuna.EduCheck.Services.Implementations.ServiceUnit;

@Service
public class ResponseStatusService extends ServiceUnit<ResponseStatus> {
    public ResponseStatusService(InMemoryResponseStatusDAO _repos) {
        super(_repos);
    }
}
