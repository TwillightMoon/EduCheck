package ru.PaleLuna.EduCheck.Controllers.Implementations.Extends;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.PaleLuna.EduCheck.Controllers.Implementations.UnitController;
import ru.PaleLuna.EduCheck.Model.Extends.Task;
import ru.PaleLuna.EduCheck.Services.Implementations.EntityService;

@Controller
@RequestMapping("/v1/task")
public class TaskController extends UnitController<Task> {
    public TaskController(EntityService<Task> _service) {
        super(_service);
    }

    @Override
    @ResponseBody
    @PostMapping("/save")
    @PreAuthorize("hasAnyAuthority('ROLE_TEACHER', 'ROLE_ADMIN')")
    public Task SaveUnit(@RequestBody Task unit) {
        System.out.println("Check");
        return super.SaveUnit(unit);
    }
}
