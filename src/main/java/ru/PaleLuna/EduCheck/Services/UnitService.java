package ru.PaleLuna.EduCheck.Services;

import java.util.List;

public interface UnitService<T> {
    List<T> FindAll();
    T Save(T unit);
    T FindByID(int id);
    T Update(T unit);
    boolean DeleteByID(int id);
}
