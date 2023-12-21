package ru.PaleLuna.EduCheck.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.PaleLuna.EduCheck.Model.Discipline;
import ru.PaleLuna.EduCheck.Services.Implementations.DisciplineService;

@Controller
@RequestMapping("/v1/discipline")
public class DisciplineController extends UnitController<Discipline>{
    public DisciplineController(DisciplineService service) {
        super(service);
    }
}
