package ru.PaleLuna.EduCheck.Controllers.Implementations.Extends;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.PaleLuna.EduCheck.Controllers.Implementations.UnitController;
import ru.PaleLuna.EduCheck.Model.Extends.Teacher;
import ru.PaleLuna.EduCheck.Services.Implementations.EntityService;
import ru.PaleLuna.EduCheck.Services.Implementations.Extends.InMemory.TeacherService;

@Controller
@RequestMapping("/v1/teacher")
public class TeacherController extends UnitController<Teacher> {
    public TeacherController(EntityService<Teacher> _service) {
        super(_service);
    }
}
