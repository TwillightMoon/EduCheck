package ru.PaleLuna.EduCheck.Controllers.Implementations.Extends;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.PaleLuna.EduCheck.Config.UserDetails;
import ru.PaleLuna.EduCheck.Controllers.Implementations.UnitController;
import ru.PaleLuna.EduCheck.Model.Extends.ResponseForm;
import ru.PaleLuna.EduCheck.Model.Extends.User;
import ru.PaleLuna.EduCheck.Services.Implementations.EntityService;
import ru.PaleLuna.EduCheck.Services.Implementations.Extends.InDataBase.ResponseFormService;

import java.util.List;

@Controller
@RequestMapping("/v1/resp_form")
public class ResponseFormController extends UnitController<ResponseForm> {
    private final ResponseFormService _service;
    public ResponseFormController(ResponseFormService _service) {
        super(_service);
        this._service = _service;
    }


    @GetMapping("status/{id}")
    @ResponseBody
    @PreAuthorize("hasAuthority('ROLE_TEACHER')")
    public List<ResponseForm> GetResFormsByStatusForTeach(@AuthenticationPrincipal UserDetails userDetails,
                                                          @PathVariable("id") int idStatus){
        return _service.GetResFormsByStatusForTeach((long) idStatus, userDetails);
    }

    @GetMapping("all-form")
    @ResponseBody
    @PreAuthorize("hasAuthority('ROLE_TEACHER')")
    public List<ResponseForm> GetResFormForTeach(@AuthenticationPrincipal UserDetails userDetails){
        return _service.GetResFormsForTeach(userDetails);
    }

    @PutMapping("mark-it/{id}/{mark}")
    @PreAuthorize("hasAuthority('ROLE_TEACHER')")
    public ResponseEntity<String> SetMark(@AuthenticationPrincipal UserDetails userDetails,
                                          @PathVariable("id") int id,
                                          @PathVariable("mark") int mark){

        if(_service.UpdateMark(userDetails, (long)id, mark))
            return ResponseEntity.ok("Mark was set!");

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Something wrong");
    }
}
