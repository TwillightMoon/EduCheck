package ru.PaleLuna.EduCheck.Controllers.Implementations.Extends;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.PaleLuna.EduCheck.Controllers.Implementations.UnitController;
import ru.PaleLuna.EduCheck.Model.Extends.Discipline;
import ru.PaleLuna.EduCheck.Services.Implementations.Extends.DisciplineService;

@Controller
@RequestMapping("/v1/discipline")
public class DisciplineController extends UnitController<Discipline> {
    public DisciplineController(DisciplineService service) {
        super(service);
    }
}
