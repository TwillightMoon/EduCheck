package ru.PaleLuna.EduCheck.Initializers;

import lombok.AllArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru.PaleLuna.EduCheck.Model.Extends.User;
import ru.PaleLuna.EduCheck.Services.Implementations.Extends.InDataBase.UserService;

import java.time.LocalDate;

@Component
@AllArgsConstructor
public class DatabaseInitializer implements ApplicationListener<ApplicationReadyEvent> {

    private final UserService userService;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        if (userService.FindByRole("ROLE_ADMIN").isEmpty()) {
            User adminUser = new User();
            adminUser.setLogin("Admin");
            adminUser.setPassword("Admin");
            adminUser.setFirstName("Admin");
            adminUser.setLastName("Admin");
            adminUser.setEmail("admin@educheck.com");
            adminUser.setRole("ROLE_ADMIN");
            adminUser.setBirthDay(LocalDate.parse("2001-09-03"));

            userService.Save(adminUser);
        }
    }
}