package ru.PaleLuna.EduCheck.Services.Implementations.Extends.InDataBase;

import ru.PaleLuna.EduCheck.Model.Extends.Teacher;
import ru.PaleLuna.EduCheck.Repositories.DBRepos.ITeacherRepos;
import ru.PaleLuna.EduCheck.Services.Implementations.EntityService;

public class TeacherService extends EntityService<Teacher> {
    public TeacherService(ITeacherRepos _repos) {
        super(_repos);
    }
}
