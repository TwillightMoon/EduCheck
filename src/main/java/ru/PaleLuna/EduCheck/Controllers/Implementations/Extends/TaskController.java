package ru.PaleLuna.EduCheck.Controllers.Implementations.Extends;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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
    @PreAuthorize("hasAnyAuthority('ROLE_TEACHER', 'ROLE_ADMIN')")
    public Task SaveUnit(@RequestBody Task unit) {
        return super.SaveUnit(unit);
    }
    @Override
    @PreAuthorize("hasAnyAuthority('ROLE_TEACHER', 'ROLE_ADMIN')")
    public ResponseEntity<String> Update(@RequestBody Task unit) {
        return super.Update(unit);
    }
    @Override
    @PreAuthorize("hasAnyAuthority('ROLE_TEACHER', 'ROLE_ADMIN', 'ROLE_STUDENT')")
    public ResponseEntity<Task> FindById(@PathVariable("id") Long id) {
        return super.FindById(id);
    }
}
