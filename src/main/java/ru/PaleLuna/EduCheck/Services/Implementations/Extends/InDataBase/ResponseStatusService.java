package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InDataBase;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.ResponseStatus;
import ru.PaleLuna.EduCheck.Repositories.DBRepos.IResponseStatusRepos;
import ru.PaleLuna.EduCheck.Services.Implementations.EntityService;

@Service
@Primary
public class ResponseStatusService extends EntityService<ResponseStatus> {
    public ResponseStatusService(IResponseStatusRepos _repos) {
        super(_repos);
    }
}
