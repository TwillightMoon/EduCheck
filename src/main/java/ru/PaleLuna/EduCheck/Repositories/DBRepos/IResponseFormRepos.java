package ru.PaleLuna.EduCheck.Repositories.DBRepos;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.PaleLuna.EduCheck.Model.Extends.ResponseForm;
import ru.PaleLuna.EduCheck.Repositories.IEntityRepos;

import java.util.List;

public interface IResponseFormRepos extends IEntityRepos<ResponseForm> {
    @Query("SELECT rf FROM ResponseForm rf " +
            "WHERE rf.teacher.id = :idTeacher AND rf.status.id = :idStatus")
    List<ResponseForm> getResponseFormsByStatusForTeacher(@Param("idTeacher") Long idTeacher, @Param("idStatus") Long idStatus);
    @Query("SELECT rf FROM ResponseForm rf WHERE rf.teacher.id = :idTeacher")
    List<ResponseForm> getResponseFormsForTeacher(@Param("idTeacher") Long idTeacher);
}
