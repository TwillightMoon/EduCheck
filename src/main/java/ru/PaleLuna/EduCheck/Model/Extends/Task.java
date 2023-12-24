package ru.PaleLuna.EduCheck.Model.Extends;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.PaleLuna.EduCheck.Model.Unit;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Task extends Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTask")
    private Long id;


    @Column(name = "Task_name", unique = true, nullable = false)
    private String taskName;

    @Column(name = "Task_Description", length = 256)
    private String taskDescription;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "idDiscipline", nullable = false)
    private Discipline discipline;

    @Override
    public Long getId() {
        return id;
    }
}
