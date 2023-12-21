package ru.PaleLuna.EduCheck.Model.Extends;

import lombok.*;
import ru.PaleLuna.EduCheck.Model.Unit;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class User extends Unit {

    //Login Data
    private String login;
    private String email;
    private String password;

    //Personal information
    private String firstName;
    private String lastName;

    private LocalDate dayOfBirth;
}
