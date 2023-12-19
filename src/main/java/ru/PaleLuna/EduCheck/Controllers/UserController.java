package ru.PaleLuna.EduCheck.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping("/save")
    @ResponseBody
    public User SaveUser(@RequestBody User user){
        return _userService.Save(user);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public User FindById(@PathVariable("id") int id){
        return _userService.FindByID(id);
    }

    @PutMapping("/update")
    @ResponseBody
    public User Update(@RequestBody User user){
        return _userService.Update(user);
    }

    //TODO доделать вариации ответов
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> DeleteById(@PathVariable("id") int id){
        _userService.DeleteByID(id);

        return ResponseEntity.ok("User was deleted");
    }
}
