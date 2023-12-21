package ru.PaleLuna.EduCheck.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.PaleLuna.EduCheck.Model.Teacher;
import ru.PaleLuna.EduCheck.Services.Implementations.TeacherService;

import java.util.List;

@Controller
@RequestMapping("/v1/teacher")
public class TeacherController extends UnitController<Teacher>{
    public TeacherController(TeacherService _service) {
        super(_service);
    }
    @Override
    @GetMapping
    public List<Teacher> GetAllUnits() {
        return super.GetAllUnits();
    }

    @Override
    @PostMapping("/save")
    public Teacher SaveUnit(@RequestBody Teacher unit) {
        return super.SaveUnit(unit);
    }

    @Override
    @GetMapping("{id}")
    public ResponseEntity<Teacher> FindById(@PathVariable("id") int id) {
        return super.FindById(id);
    }

    @Override
    @PutMapping("/update")
    public ResponseEntity<String> Update(@RequestBody Teacher unit) {
        return super.Update(unit);
    }

    @Override
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> DeleteById(@PathVariable("id") int id) {
        return super.DeleteById(id);
    }
}
