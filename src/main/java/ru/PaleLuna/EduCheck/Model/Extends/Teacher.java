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
public class Teacher extends Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int idUser;

    @Override
    public Long getId() {
        return id;
    }
}
