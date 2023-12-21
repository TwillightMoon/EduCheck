package ru.PaleLuna.EduCheck.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.PaleLuna.EduCheck.Model.Student;
import ru.PaleLuna.EduCheck.Services.Implementations.StudentService;

import java.util.List;

//TODO
@Controller
@RequestMapping("/v1/student")
public class StudentController extends UnitController<Student>{

    public StudentController(StudentService service) {
        super(service);
    }

    @Override
    @GetMapping
    public List<Student> GetAllUnits() {
        return super.GetAllUnits();
    }

    @Override
    @PostMapping("/save")
    public Student SaveUnit(@RequestBody Student unit) {
        return super.SaveUnit(unit);
    }

    @Override
    @ResponseBody
    @GetMapping("{id}")
    public ResponseEntity<Student> FindById(@PathVariable("id") int id) {
        return super.FindById(id);
    }

    @Override
    @PutMapping("/update")
    public ResponseEntity<String> Update(@RequestBody Student unit) {
        return super.Update(unit);
    }

    @Override
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> DeleteById(@PathVariable("id") int id) {
        return super.DeleteById(id);
    }

}
