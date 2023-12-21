package ru.PaleLuna.EduCheck.Model.Extends;

import lombok.Data;
import ru.PaleLuna.EduCheck.Model.Unit;

@Data
public class Discipline extends Unit {
    private String disciplineName;

    public Discipline(final int id, final String disciplineName){
        this.id = id;
        this.disciplineName = disciplineName;
    }
}
