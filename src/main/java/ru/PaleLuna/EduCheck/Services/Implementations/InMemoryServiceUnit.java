package ru.PaleLuna.EduCheck.Services.Implementations;

import lombok.AllArgsConstructor;
import ru.PaleLuna.EduCheck.Model.Unit;
import ru.PaleLuna.EduCheck.Repositories.Implementations.InMemory.InMemoryDAO;
import ru.PaleLuna.EduCheck.Services.IUnitService;

import java.util.List;

@AllArgsConstructor
public abstract class InMemoryServiceUnit<T extends Unit> implements IUnitService<T> {

    private final InMemoryDAO<T> _repos;

    @Override
    public List<T> FindAll(){
        return _repos.FindAll();
    }

    @Override
    public T Save(T unit) {
        return _repos.Save(unit);
    }

    @Override
    public T FindByID(Long id) {
        return _repos.FindByID(id);
    }

    @Override
    public T Update(T unit) {
        return _repos.Update(unit);
    }

    @Override
    public boolean DeleteByID(Long id) {
        return _repos.DeleteByID(id);
    }
}
