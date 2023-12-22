package ru.PaleLuna.EduCheck.Model.Extends;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    //Login Data
    private String login;
    private String email;
    private String password;

    //Personal information
    private String firstName;
    private String lastName;

    private LocalDate dayOfBirth;

    @Override
    public int getId() {
        return id;
    }
}
