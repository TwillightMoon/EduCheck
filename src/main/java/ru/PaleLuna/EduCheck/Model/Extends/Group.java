package ru.PaleLuna.EduCheck.Model.Extends;

import lombok.*;
import ru.PaleLuna.EduCheck.Model.Unit;

@AllArgsConstructor
@Data
public class Group extends Unit {

    private int id;
    private String groupName;

    @Override
    public int getId() {
        return id;
    }
}
