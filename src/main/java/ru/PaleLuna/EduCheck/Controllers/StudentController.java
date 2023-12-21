package ru.PaleLuna.EduCheck.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.PaleLuna.EduCheck.Model.Student;
import ru.PaleLuna.EduCheck.Model.User;
import ru.PaleLuna.EduCheck.Services.Implementations.StudentService;

import java.util.List;

//TODO
@Controller
@RequestMapping("/v1/student")
@AllArgsConstructor
public class StudentController {
    private final StudentService _studentService;

    @GetMapping
    @ResponseBody
    public List<Student> GetAllUsers(){
        return _studentService.FindAll();
    }

    @PostMapping("/save")
    @ResponseBody
    public Student SaveUser(@RequestBody Student student){
        return _studentService.Save(student);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Student> FindById(@PathVariable("id") int id){
        Student user = _studentService.FindByID(id);
        boolean isUser = IsNotNull(user);

        if(isUser)
            return ResponseEntity.ok(user);
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    @PutMapping("/update")
    @ResponseBody
    public ResponseEntity<String> Update(@RequestBody Student user){
        boolean isUser = IsNotNull(_studentService.Update(user));

        if(isUser)
            return ResponseEntity.ok("User was updated");
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
    }

    //TODO доделать вариации ответов
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> DeleteById(@PathVariable("id") int id){

        boolean isDeleted = _studentService.DeleteByID(id);

        if(isDeleted)
            return ResponseEntity.ok("User was deleted");
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
    }

    private boolean IsNotNull(Student user) {
        return user != null;
    }
}
