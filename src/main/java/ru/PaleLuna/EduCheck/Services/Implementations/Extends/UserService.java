package ru.PaleLuna.EduCheck.Services.Implementations.Extends;

import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.User;
import ru.PaleLuna.EduCheck.Repositories.Implementations.Extends.InMemoryUsersDAO;
import ru.PaleLuna.EduCheck.Services.Implementations.ServiceUnit;

@Service
public class UserService extends ServiceUnit<User> {
    public UserService(InMemoryUsersDAO repos) {
        super(repos);
    }
}
