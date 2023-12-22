package ru.PaleLuna.EduCheck.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.PaleLuna.EduCheck.Model.Unit;

import java.util.List;

public interface IUnitController<T extends Unit> {

    public List<T> GetAllUnits();

    public T SaveUnit(@RequestBody T unit);
    public ResponseEntity<T> FindById(Long id);
    public ResponseEntity<String> Update(@RequestBody T unit);

    //TODO доделать вариации ответов
    public ResponseEntity<String> DeleteById(Long id);
}
