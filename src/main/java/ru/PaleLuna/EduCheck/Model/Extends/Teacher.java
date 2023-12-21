package ru.PaleLuna.EduCheck.Model.Extends;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.PaleLuna.EduCheck.Model.Unit;

@AllArgsConstructor
@Data
public class Teacher extends Unit {
    private int idUser;

    public Teacher(final int id, final int idUser){
        this.id = id;
        this.idUser = idUser;
    }
}
