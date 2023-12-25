package ru.PaleLuna.EduCheck.Controllers.Implementations.Extends;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.PaleLuna.EduCheck.Controllers.Implementations.UnitController;
import ru.PaleLuna.EduCheck.Model.Extends.Group;
import ru.PaleLuna.EduCheck.Model.Extends.User;
import ru.PaleLuna.EduCheck.Services.Implementations.EntityService;

import java.util.List;

@Controller
@RequestMapping("/v1/group")
public class GroupController extends UnitController<Group> {
    public GroupController(EntityService<Group> service) {
        super(service);
    }

    @Override
    @PreAuthorize("permitAll()")
    public List<Group> GetAllUnits() {
        return super.GetAllUnits();
    }
}
