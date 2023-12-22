package ru.PaleLuna.EduCheck.Model.Extends;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.PaleLuna.EduCheck.Model.Unit;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Task extends Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String taskName;
    private String description;

    //Foreign keys
    private int idDiscipline;

    @Override
    public Long getId() {
        return id;
    }
}
