package ru.PaleLuna.EduCheck.Model.Extends;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.PaleLuna.EduCheck.Model.Unit;

//TODO Реализовать сущность студента
@AllArgsConstructor
@Data
public class Student extends Unit {
    private int idUser;
    private int idGroup;
}
