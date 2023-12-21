package ru.PaleLuna.EduCheck.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.PaleLuna.EduCheck.Model.Unit;
import ru.PaleLuna.EduCheck.Model.User;

import java.util.List;

public interface IUnitController<T extends Unit> {

    public List<T> GetAllUsers();

    public T SaveUser(@RequestBody T unit);
    public ResponseEntity<T> FindById(int id);
    public ResponseEntity<String> Update(@RequestBody T unit);

    //TODO доделать вариации ответов
    public ResponseEntity<String> DeleteById(int id);
}
