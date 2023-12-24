package ru.PaleLuna.EduCheck.Services.Implementations;

import lombok.AllArgsConstructor;
import ru.PaleLuna.EduCheck.Model.Unit;
import ru.PaleLuna.EduCheck.Repositories.IEntityRepos;
import ru.PaleLuna.EduCheck.Services.IUnitService;

import java.util.List;

@AllArgsConstructor
public abstract class EntityService <T extends Unit> implements IUnitService<T> {
    protected final IEntityRepos<T> _repos;

    @Override
    public List<T> FindAll() {
        return _repos.findAll();
    }

    @Override
    public T Save(T unit) {
        return _repos.save(unit);
    }

    @Override
    public T FindByID(Long id) {
        return _repos.findEntityById(id);
    }

    @Override
    public T Update(T unit) {
        return _repos.save(unit);
    }

    @Override
    public boolean DeleteByID(Long id) {
        _repos.deleteById(id);

        return !_repos.existsById(id);
    }
}
