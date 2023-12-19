package ru.PaleLuna.EduCheck.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.PaleLuna.EduCheck.Model.User;
import ru.PaleLuna.EduCheck.Services.Implementations.UserService;

import java.util.List;

@Controller
@RequestMapping("/v1/user")
@AllArgsConstructor
public class UserController {

    private final UserService _userService;

    @GetMapping
    @ResponseBody
    public List<User> GetAllUsers(){
        return _userService.FindAll();
    }
}
