package ru.PaleLuna.EduCheck.Repositories;

import org.springframework.stereotype.Repository;
import ru.PaleLuna.EduCheck.Model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryUsersDAO {
    private final List<User> USERS = new ArrayList<>();

    public List<User> FindAll(){
        return USERS;
    }

    public User Save(User unit) {
        USERS.add(unit);
        return unit;
    }

    public User FindByID(int id) {
        return USERS.stream().
                filter(element -> element.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public User Update(User unit) {
        int userIndex = IntStream.range(0, USERS.size())
                .filter(index -> USERS.get(index).getId() == unit.getId())
                .findFirst()
                .orElse(-1);

        if(userIndex >= 0){
            USERS.set(userIndex, unit);
            return USERS.get(userIndex);
        }

        return null;
    }

    public void Delete(User unit) {
        USERS.remove(unit);
    }

    public void DeleteUnitByID(int id) {
        User user = FindByID(id);

        if(user != null)
            USERS.remove(user);
    }

}
