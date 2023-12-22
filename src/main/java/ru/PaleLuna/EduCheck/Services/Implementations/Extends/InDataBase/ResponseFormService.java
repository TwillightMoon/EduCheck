package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InDataBase;

import ru.PaleLuna.EduCheck.Model.Extends.ResponseForm;
import ru.PaleLuna.EduCheck.Repositories.DBRepos.IResponseFormRepos;
import ru.PaleLuna.EduCheck.Services.Implementations.EntityService;

public class ResponseFormService extends EntityService<ResponseForm> {
    public ResponseFormService(IResponseFormRepos _repos) {
        super(_repos);
    }
}
