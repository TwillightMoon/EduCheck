package ru.PaleLuna.EduCheck.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.PaleLuna.EduCheck.Model.Unit;
import ru.PaleLuna.EduCheck.Services.Implementations.ServiceUnit;

import java.util.List;

@AllArgsConstructor
public class UnitController<T extends Unit> implements IUnitController<T> {

    private final ServiceUnit<T> _service;

    @Override
    @ResponseBody
    @GetMapping
    public List<T> GetAllUnits() {
        return _service.FindAll();
    }

    @Override
    @ResponseBody
    @PostMapping("/save")
    public T SaveUnit(@RequestBody T unit) {
        return _service.Save(unit);
    }

    @Override
    @ResponseBody
    @GetMapping("{id}")
    public ResponseEntity<T> FindById(int id) {
        T unit = _service.FindByID(id);
        boolean isUser = IsNotNull(unit);

        if(isUser)
            return ResponseEntity.ok(unit);
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    @Override
    @PutMapping("/update")
    public ResponseEntity<String> Update(@RequestBody T unit) {
        boolean isUser = IsNotNull(_service.Update(unit));

        if(isUser)
            return ResponseEntity.ok("User was updated");
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
    }

    @Override
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> DeleteById(int id) {
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
