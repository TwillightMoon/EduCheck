package ru.PaleLuna.EduCheck.Model.Extends;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.PaleLuna.EduCheck.Model.Unit;

@Data
@AllArgsConstructor
public class Task extends Unit {
    private String taskName;
    private String description;

    //Foreign keys
    private int idDiscipline;

    @Override
    public Long getId() {
        return null;
    }
}
