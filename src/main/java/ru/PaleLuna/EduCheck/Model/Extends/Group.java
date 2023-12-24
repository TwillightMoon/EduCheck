package ru.PaleLuna.EduCheck.Model.Extends;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import ru.PaleLuna.EduCheck.Model.Unit;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "group_table")
public class Group extends Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGroup")
    private Long id;

    @Column(name = "GroupName", nullable = false, unique = true)
    private String groupName;

    @ManyToMany(mappedBy = "groups")
    @JsonIgnore
    private List<Teacher> teachers = new ArrayList<>();

    @Override
    public Long getId() {
        return id;
    }
}
