package ru.PaleLuna.EduCheck.Model.Extends;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import ru.PaleLuna.EduCheck.Model.Unit;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Discipline extends Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDiscipline")
    private Long id;

    @Column(name = "Discipline_Name", unique = true, nullable = false)
    private String disciplineName;

    @ManyToMany(mappedBy = "disciplines")
    @JsonIgnore
    private List<Teacher> teachers = new ArrayList<>();

    @Override
    public Long getId() {
        return id;
    }
}
