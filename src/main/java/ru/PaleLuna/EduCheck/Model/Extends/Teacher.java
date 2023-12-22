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
public class Teacher extends Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTeacher")
    private Long id;

    @OneToOne
    @JoinColumn(name = "idUser", nullable = false, unique = true)
    private User user;

    @Override
    public Long getId() {
        return id;
    }
}
