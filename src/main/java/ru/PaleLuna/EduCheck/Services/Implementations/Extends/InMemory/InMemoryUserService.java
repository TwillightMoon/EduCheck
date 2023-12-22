package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InMemory;

import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.User;
import ru.PaleLuna.EduCheck.Repositories.Implementations.InMemory.Extends.InMemoryUsersDAO;
import ru.PaleLuna.EduCheck.Services.Implementations.InMemoryServiceUnit;

@Service
public class InMemoryUserService extends InMemoryServiceUnit<User> {
    public InMemoryUserService(InMemoryUsersDAO repos) {
        super(repos);
    }
}
