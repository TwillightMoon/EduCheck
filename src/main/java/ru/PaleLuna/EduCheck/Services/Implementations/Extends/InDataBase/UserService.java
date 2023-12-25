package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InDataBase;

import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.User;
import ru.PaleLuna.EduCheck.Repositories.DBRepos.IUserRepos;
import ru.PaleLuna.EduCheck.Services.Implementations.EntityService;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class UserService extends EntityService<User> implements UserDetailsService {
    IUserRepos repos;
    PasswordEncoder encoder;

    public UserService(IUserRepos _repos, PasswordEncoder encoder) {
        super(_repos);
        this.repos = _repos;
        this.encoder = encoder;
    }

    @Override
    public User Save(User unit) {
        unit.setPassword(encoder.encode(unit.getPassword()));
        return super.Save(unit);
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Optional<User> user = repos.findByLogin(login);

        return user.map(ru.PaleLuna.EduCheck.Config.UserDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException(login + " not found"));
    }

    public List<User> FindByRole(String role){
        return repos.findUsersByRole(role);
    }

    public User FindByLogin(String login){
        return repos.FindByLogin(login);
    }
}
