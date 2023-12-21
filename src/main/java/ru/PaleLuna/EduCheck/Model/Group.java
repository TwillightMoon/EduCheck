package ru.PaleLuna.EduCheck.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

//TODO Реализовать сущность группы
@AllArgsConstructor
@Data
public class Group extends Unit{
    private String groupName;
}
