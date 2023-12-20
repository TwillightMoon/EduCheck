package ru.PaleLuna.EduCheck.Services.Implementations;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.User;
import ru.PaleLuna.EduCheck.Repositories.Implementations.InMemoryDAO;
import ru.PaleLuna.EduCheck.Repositories.Implementations.InMemoryUsersDAO;
import ru.PaleLuna.EduCheck.Services.IUnitService;

import java.util.List;

@Service
public class UserService extends ServiceUnit<User> {
    public UserService() {
        super(new InMemoryUsersDAO());
    }
}
