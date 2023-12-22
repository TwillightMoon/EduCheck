package ru.PaleLuna.EduCheck.Controllers.Implementations.Extends;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.PaleLuna.EduCheck.Controllers.Implementations.UnitController;
import ru.PaleLuna.EduCheck.Model.Extends.Student;
import ru.PaleLuna.EduCheck.Model.Extends.Teacher;
import ru.PaleLuna.EduCheck.Services.Implementations.EntityService;
import ru.PaleLuna.EduCheck.Services.Implementations.Extends.InMemory.StudentService;

//TODO
@Controller
@RequestMapping("/v1/student")
public class StudentController extends UnitController<Student> {

    public StudentController(EntityService<Student> service) {
        super(service);
    }
}
