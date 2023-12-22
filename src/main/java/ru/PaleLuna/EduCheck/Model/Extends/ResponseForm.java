package ru.PaleLuna.EduCheck.Model.Extends;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.PaleLuna.EduCheck.Model.Unit;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ResponseForm extends Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


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
