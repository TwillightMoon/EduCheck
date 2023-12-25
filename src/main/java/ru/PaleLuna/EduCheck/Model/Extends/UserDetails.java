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

    private String role;

    //Login Data
    @Column(name = "Login", unique = true, nullable = false)
    private String login;

    @Column(name = "E-mail", unique = true, nullable = false)
    private String email;

    @Column(name = "Password", nullable = false)
    private String password;

    @Column(name = "FirstName", nullable = false)
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "BirthDay", nullable = false)
    private LocalDate birthDay;

    @Override
    public Long getId() {
        return id;
    }
}
