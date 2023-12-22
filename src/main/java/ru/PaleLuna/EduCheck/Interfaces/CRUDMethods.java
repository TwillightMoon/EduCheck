package ru.PaleLuna.EduCheck.Interfaces;

import java.util.List;

public interface CRUDMethods<T> {
    List<T> FindAll();
    T Save(T unit);
    T FindByID(Long id);
    T Update(T unit);
    boolean DeleteByID(Long id);
}
