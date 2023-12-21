package ru.PaleLuna.EduCheck.Model.Extends;

import lombok.*;
import ru.PaleLuna.EduCheck.Model.Unit;

@AllArgsConstructor
@Data
public class Group extends Unit {
    private String groupName;

    public Group(final int id, final String groupName){
        this.id = id;
        this.groupName = groupName;
    }
}
