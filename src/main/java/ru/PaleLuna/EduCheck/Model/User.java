package ru.PaleLuna.EduCheck.Model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;

@Data
@Builder
public class User {
    private int id;

    //Login Data
    private String login;
    private String email;
    private String password;

    //Personal information
    private String firstName;
    private String secondName;
    private String lastName;

    private LocalDate dayOfBirth;
}
