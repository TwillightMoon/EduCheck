package ru.PaleLuna.EduCheck.Services.Implementations;

import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.User;
import ru.PaleLuna.EduCheck.Services.UnitService;

import java.util.List;

@Service
public class UserService implements UnitService<User> {
    @Override
    public List<User> FindAll(){
        return List.of(
                User.builder().id(1).login("FirstLog").email("Ex@g.com").password("abc").firstName("Josh").build(),
                User.builder().id(2).login("SecondLog").email("Ex1@g.com").password("bcd").firstName("Maria").build(),
                User.builder().id(3).login("ThirdLog").email("Ex2@g.com").password("cde").firstName("Sam").build(),
                User.builder().id(4).login("FourthLog").email("Ex3@g.com").password("def").firstName("Cool").build()
        );
    }
}
