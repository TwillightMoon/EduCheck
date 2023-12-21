package ru.PaleLuna.EduCheck.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

//TODO Реализовать сущность студента
@AllArgsConstructor
@Data
public class Student extends Unit {
    private int idUser;
    private int idGroup;
}
