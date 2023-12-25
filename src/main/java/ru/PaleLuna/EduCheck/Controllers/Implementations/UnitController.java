package ru.PaleLuna.EduCheck.Controllers.Implementations;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import ru.PaleLuna.EduCheck.Controllers.IUnitController;
import ru.PaleLuna.EduCheck.Model.Unit;
import ru.PaleLuna.EduCheck.Services.IUnitService;

import java.util.List;

@AllArgsConstructor
public abstract class UnitController<T extends Unit> implements IUnitController<T> {

    private final IUnitService<T> _service;

    @Override
    @ResponseBody
    @GetMapping
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<T> GetAllUnits() {
        return _service.FindAll();
    }

    @Override
    @ResponseBody
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public T SaveUnit(@RequestBody T unit) {
        System.out.println("Check1");
        return _service.Save(unit);
    }

    @Override
    @ResponseBody
    @GetMapping("{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public ResponseEntity<T> FindById(@PathVariable("id") Long id) {
        T unit = _service.FindByID(id);
        boolean isUser = IsNotNull(unit);

        if(isUser)
            return ResponseEntity.ok(unit);
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    @Override
    @PutMapping("/update")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public ResponseEntity<String> Update(@RequestBody T unit) {
        boolean isUser = IsNotNull(_service.Update(unit));

        if(isUser)
            return ResponseEntity.ok("User was updated");
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
    }

    @Override
    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public ResponseEntity<String> DeleteById(@PathVariable("id") Long id) {
        boolean isDeleted = _service.DeleteByID(id);

        if(isDeleted)
            return ResponseEntity.ok("User was deleted");
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
    }

    private boolean IsNotNull(Unit unit) {
        return unit != null;
    }
}
