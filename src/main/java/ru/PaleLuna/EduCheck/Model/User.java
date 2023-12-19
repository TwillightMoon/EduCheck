package ru.PaleLuna.EduCheck.Model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;

@Data
@Builder
public class User {
    private int _id;

    //Login Data
    private String _login;
    private String _email;
    private String _password;

    //Personal information
    private String _firstName;
    private String _secondName;
    private String _lastName;

    private LocalDate _dayOfBirth;
}
