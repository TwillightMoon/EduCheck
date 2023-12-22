package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InDataBase;

import ru.PaleLuna.EduCheck.Model.Extends.ResponseStatus;
import ru.PaleLuna.EduCheck.Repositories.DBRepos.IResponseStatusRepos;
import ru.PaleLuna.EduCheck.Services.Implementations.EntityService;

public class ResponseStatusService extends EntityService<ResponseStatus> {
    public ResponseStatusService(IResponseStatusRepos _repos) {
        super(_repos);
    }
}
