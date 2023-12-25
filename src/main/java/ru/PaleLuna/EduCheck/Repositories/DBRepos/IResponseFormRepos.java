package ru.PaleLuna.EduCheck.Repositories.DBRepos;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.PaleLuna.EduCheck.Model.Extends.ResponseForm;
import ru.PaleLuna.EduCheck.Repositories.IEntityRepos;

import java.util.List;

public interface IResponseFormRepos extends IEntityRepos<ResponseForm> {
    @Query("SELECT rf FROM ResponseForm rf " +
            "WHERE (rf.teacher.id = :idUser OR rf.student.id = :idUser) AND rf.status.id = :idStatus")
    List<ResponseForm> getResponseFormsByStatusForUser(@Param("idUser") Long idUser, @Param("idStatus") Long idStatus);
    @Query("SELECT rf FROM ResponseForm rf WHERE rf.teacher.id = :idUser OR rf.student.id = :idUser")
    List<ResponseForm> getResponseFormsForUser(@Param("idUser") Long idUser);
}
