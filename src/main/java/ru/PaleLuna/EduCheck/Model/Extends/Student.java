package ru.PaleLuna.EduCheck.Model.Extends;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.PaleLuna.EduCheck.Model.Unit;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student extends Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idUser", nullable = false, unique = true)
    private User user;

    @ManyToOne
    @JoinColumn(name = "idGroup")
    private Group group;

    @Override
    public Long getId() {
        return id;
    }


}
