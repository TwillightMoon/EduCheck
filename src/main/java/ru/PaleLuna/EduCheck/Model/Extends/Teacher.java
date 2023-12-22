package ru.PaleLuna.EduCheck.Model.Extends;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.PaleLuna.EduCheck.Model.Unit;

@AllArgsConstructor
@Data
public class Teacher extends Unit {
    private int idUser;

    @Override
    public int getId() {
        return 0;
    }
}
