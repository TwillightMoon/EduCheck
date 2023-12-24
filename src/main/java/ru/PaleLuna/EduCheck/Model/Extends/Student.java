package ru.PaleLuna.EduCheck.Model.Extends;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.engine.internal.Cascade;
import ru.PaleLuna.EduCheck.Model.Unit;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student extends Unit {
    @Id
    private Long id;

    @OneToOne(cascade = CascadeType.REMOVE, orphanRemoval = true, optional = false)
    @JoinColumn(name = "id", nullable = false, unique = true)
    @MapsId
    private User user;

    @ManyToOne
    @JoinColumn(name = "idGroup")
    private Group group;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<ResponseForm> responseForms = new ArrayList<>();

    @Override
    public Long getId() {
        return id;
    }
}
