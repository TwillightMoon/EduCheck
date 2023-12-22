package ru.PaleLuna.EduCheck.Model.Extends;

import lombok.Data;
import ru.PaleLuna.EduCheck.Model.Unit;

@Data
public class ResponseStatus extends Unit {
    private String name;

    public ResponseStatus(int id, String name){
        this.id = id;
        this.name = name;
    }
}
