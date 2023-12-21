package ru.PaleLuna.EduCheck.Model;

import lombok.*;

@AllArgsConstructor
@Data
public class Group extends Unit{
    private String groupName;

    public Group(final int id, final String groupName){
        this.id = id;
        this.groupName = groupName;
    }
}
