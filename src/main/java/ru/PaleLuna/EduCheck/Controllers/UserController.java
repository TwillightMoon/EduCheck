package ru.PaleLuna.EduCheck.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<User> FindById(@PathVariable("id") int id){
        User user = _userService.FindByID(id);
        boolean isUser = IsNotNull(user);

        if(isUser)
            return ResponseEntity.ok(user);
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    @PutMapping("/update")
    @ResponseBody
    public ResponseEntity<String> Update(@RequestBody User user){
        boolean isUser = IsNotNull(_userService.Update(user));

        if(isUser)
            return ResponseEntity.ok("User was updated");
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
    }

    //TODO доделать вариации ответов
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> DeleteById(@PathVariable("id") int id){

        boolean isDeleted = _userService.DeleteByID(id);

        if(isDeleted)
            return ResponseEntity.ok("User was deleted");
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
    }

    private boolean IsNotNull(User user) {
        return user != null;
    }
}
