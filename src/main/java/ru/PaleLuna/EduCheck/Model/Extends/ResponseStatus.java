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
public class ResponseStatus extends Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Status_name", unique = true, nullable = false)
    private String statusName;

    @Override
    public Long getId() {
        return id;
    }
}
