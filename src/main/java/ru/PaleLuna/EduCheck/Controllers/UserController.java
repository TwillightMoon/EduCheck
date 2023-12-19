package ru.PaleLuna.EduCheck.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.PaleLuna.EduCheck.Model.User;

import java.util.List;

@Controller
@RequestMapping("/v1/user")
public class UserController {
    @GetMapping
    @ResponseBody
    public List<User> GetAllUsers(){
        return List.of(
                User.builder()._id(1)._login("FirstLog")._email("Ex@g.com")._password("abc")._firstName("Josh").build(),
                User.builder()._id(2)._login("SecondtLog")._email("Ex1@g.com")._password("bcd")._firstName("Josh").build(),
                User.builder()._id(3)._login("ThirdLog")._email("Ex2@g.com")._password("cde")._firstName("Josh").build(),
                User.builder()._id(4)._login("FourthLog")._email("Ex3@g.com")._password("def")._firstName("Josh").build()
        );
    }
}
