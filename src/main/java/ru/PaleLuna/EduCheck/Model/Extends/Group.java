package ru.PaleLuna.EduCheck.Model.Extends;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import ru.PaleLuna.EduCheck.Model.Unit;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Group extends Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String groupName;

    @Override
    public Long getId() {
        return id;
    }
}
