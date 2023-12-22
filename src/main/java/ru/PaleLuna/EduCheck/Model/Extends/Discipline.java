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
public class Discipline extends Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String disciplineName;

    @Override
    public Long getId() {
        return id;
    }
}
