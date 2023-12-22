package ru.PaleLuna.EduCheck.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

@NoRepositoryBean
public interface IEntityRepos<T> extends JpaRepository<T, Long> {
    @Query("SELECT entity FROM #{#entityName} entity WHERE entity.id = :id")
    T findEntityById(@Param("id") Long id);
}
