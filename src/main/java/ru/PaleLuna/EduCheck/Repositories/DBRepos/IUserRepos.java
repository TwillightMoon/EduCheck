package ru.PaleLuna.EduCheck.Repositories.DBRepos;

import org.springframework.stereotype.Repository;
import ru.PaleLuna.EduCheck.Model.Extends.User;
import ru.PaleLuna.EduCheck.Repositories.IEntityRepos;

import java.util.Optional;

@Repository
public interface IUserRepos extends IEntityRepos<User> {
    Optional<User> findByLogin(String login);
}
