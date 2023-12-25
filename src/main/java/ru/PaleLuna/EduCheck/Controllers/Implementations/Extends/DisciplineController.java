package ru.PaleLuna.EduCheck.Controllers.Implementations.Extends;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.PaleLuna.EduCheck.Controllers.Implementations.UnitController;
import ru.PaleLuna.EduCheck.Model.Extends.Discipline;
import ru.PaleLuna.EduCheck.Services.Implementations.EntityService;

@Controller
@RequestMapping("/v1/discipline")
public class DisciplineController extends UnitController<Discipline> {
    public DisciplineController(EntityService<Discipline> service) {
        super(service);
    }

    @Override
    @PreAuthorize("permitAll()")
    public ResponseEntity<Discipline> FindById(@PathVariable("id") Long id) {
        return super.FindById(id);
    }
}
