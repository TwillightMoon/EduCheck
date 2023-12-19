package ru.PaleLuna.EduCheck.Services;

import java.util.List;

public interface UnitService<T> {
    List<T> FindAll();
    T Save(T unit);
    T FindByID(int id);
    T Update(T unit);
    void Delete(T unit);
    void DeleteByID(int id);
}
