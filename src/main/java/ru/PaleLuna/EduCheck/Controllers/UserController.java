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
                User.builder().id(1).login("FirstLog").email("Ex@g.com").password("abc").firstName("Josh").build(),
                User.builder().id(2).login("SecondtLog").email("Ex1@g.com").password("bcd").firstName("Josh").build(),
                User.builder().id(3).login("ThirdLog").email("Ex2@g.com").password("cde").firstName("Josh").build(),
                User.builder().id(4).login("FourthLog").email("Ex3@g.com").password("def").firstName("Josh").build()
        );
    }
}
