package ru.PaleLuna.EduCheck.Controllers.Implementations.Extends;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.PaleLuna.EduCheck.Controllers.Implementations.UnitController;
import ru.PaleLuna.EduCheck.Model.Extends.ResponseForm;
import ru.PaleLuna.EduCheck.Services.Implementations.EntityService;

import java.util.List;

@Controller
@RequestMapping("/v1/resp_form")
public class ResponseFormController extends UnitController<ResponseForm> {
    public ResponseFormController(EntityService<ResponseForm> _service) {
        super(_service);
    }

}
