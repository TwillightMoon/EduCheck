package ru.PaleLuna.EduCheck.Repositories.Implementations.InMemory;

import lombok.AllArgsConstructor;
import ru.PaleLuna.EduCheck.Model.Unit;
import ru.PaleLuna.EduCheck.Repositories.IInMemoryDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@AllArgsConstructor
public abstract class InMemoryDAO<T extends Unit> implements IInMemoryDAO<T> {
    private final List<T> UNITS = new ArrayList<>();

    public List<T> FindAll(){
        return UNITS;
    }

    public T Save(T unit) {
        UNITS.add(unit);
        return unit;
    }

    public T FindByID(Long id) {
        return UNITS.stream().
                filter(element -> element.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public T Update(T unit) {
        int userIndex = IntStream.range(0, UNITS.size())
                .filter(index -> UNITS.get(index).getId() == unit.getId())
                .findFirst()
                .orElse(-1);

        if(userIndex >= 0){
            UNITS.set(userIndex, unit);
            return UNITS.get(userIndex);
        }

        return null;
    }

    @Override
    public boolean DeleteByID(Long id) {
        T unit = FindByID(id);
        boolean isUser = unit != null;

        if(isUser)
            UNITS.remove(unit);

        return isUser;
    }
}
