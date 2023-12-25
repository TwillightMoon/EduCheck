package ru.PaleLuna.EduCheck.Repositories.DBRepos;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.PaleLuna.EduCheck.Model.Extends.User;
import ru.PaleLuna.EduCheck.Repositories.IEntityRepos;

import java.util.List;
import java.util.Optional;

@Repository
public interface IUserRepos extends IEntityRepos<User> {
    Optional<User> findByLogin(String login);
    @Query("SELECT user FROM User user WHERE user.role = :role")
    List<User> findUsersByRole(@Param("role") String role);

}
