package ru.PaleLuna.EduCheck.Model.Extends;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.PaleLuna.EduCheck.Model.Unit;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ResponseForm extends Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Deadline", nullable = false)
    private LocalDate deadline;

    @Column(name = "Upload_date")
    private LocalDate uploadDate;

    @Column(name = "Mark")
    private Integer mark;

    @ManyToOne
    @JoinColumn(name = "idStatus", nullable = false)
    private ResponseStatus status;

    @ManyToOne
    @JoinColumn(name = "idTeacher")
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "idStudent", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "Task_idTask", nullable = false)
    private Task task;

    @Override
    public Long getId() {
        return id;
    }
}
