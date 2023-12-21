package ru.PaleLuna.EduCheck.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Teacher extends Unit {
    private int idUser;

    public Teacher(final int id, final int idUser){
        this.id = id;
        this.idUser = idUser;
    }
}
