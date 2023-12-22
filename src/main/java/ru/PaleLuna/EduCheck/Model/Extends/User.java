package ru.PaleLuna.EduCheck.Model.Extends;

import jakarta.persistence.*;
import lombok.*;
import ru.PaleLuna.EduCheck.Model.Unit;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User extends Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Login Data
    @Column(unique = true)
    private String login;
    @Column(unique = true)
    private String email;
    private String password;

    //Personal information
    private String firstName;
    private String lastName;

    private LocalDate dayOfBirth;

    @Override
    public Long getId() {
        return id;
    }
}
