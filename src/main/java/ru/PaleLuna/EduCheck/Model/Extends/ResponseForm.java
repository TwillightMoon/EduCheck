package ru.PaleLuna.EduCheck.Model.Extends;


import lombok.AllArgsConstructor;
import lombok.Data;
import ru.PaleLuna.EduCheck.Model.Unit;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class ResponseForm extends Unit {
    private LocalDate deadline;
    private LocalDate uploadDate;
    private int mark;

    //Foreign keys
    private int idStatus;
    private int idTeacher;
    private int idStudent;
    private int idTask;

    @Override
    public Long getId() {
        return null;
    }
}
