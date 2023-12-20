package ru.PaleLuna.EduCheck.Services.Implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.User;
import ru.PaleLuna.EduCheck.Repositories.Implementations.InMemoryUsersDAO;
import ru.PaleLuna.EduCheck.Services.IUnitService;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService implements IUnitService<User> {

    private final InMemoryUsersDAO _repos;

    @Override
    public List<User> FindAll(){
        return _repos.FindAll();
    }

    @Override
    public User Save(User unit) {
        return _repos.Save(unit);
    }

    @Override
    public User FindByID(int id) {
        return _repos.FindByID(id);
    }

    @Override
    public User Update(User unit) {
        return _repos.Update(unit);
    }

    @Override
    public boolean DeleteByID(int id) {
        return _repos.DeleteByID(id);
    }
}
