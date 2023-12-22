package ru.PaleLuna.EduCheck.Model.Extends;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.PaleLuna.EduCheck.Model.Unit;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Teacher extends Unit {
    private int idUser;

    @Override
    public Long getId() {
        return null;
    }
}
