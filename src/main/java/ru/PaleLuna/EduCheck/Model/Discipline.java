package ru.PaleLuna.EduCheck.Model;

import lombok.Data;

@Data
public class Discipline extends Unit{
    private String disciplineName;

    public Discipline(final int id, final String disciplineName){
        this.id = id;
        this.disciplineName = disciplineName;
    }
}
