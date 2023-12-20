package ru.PaleLuna.EduCheck.Repositories.Implementations;

import org.springframework.stereotype.Repository;
import ru.PaleLuna.EduCheck.Model.User;
import ru.PaleLuna.EduCheck.Repositories.IInMemoryDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryUsersDAO extends InMemoryDAO<User> {

}
