package ru.PaleLuna.EduCheck.Controllers.Implementations.Extends;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.PaleLuna.EduCheck.Controllers.Implementations.UnitController;
import ru.PaleLuna.EduCheck.Model.Extends.Task;
import ru.PaleLuna.EduCheck.Services.Implementations.Extends.TaskService;

@Controller
@RequestMapping("/v1/task")
public class TaskController extends UnitController<Task> {
    public TaskController(TaskService _service) {
        super(_service);
    }
}
