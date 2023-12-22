package ru.PaleLuna.EduCheck.Model.Extends;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.PaleLuna.EduCheck.Model.Unit;

@Data
@AllArgsConstructor
public class ResponseStatus extends Unit {
    private String name;

    @Override
    public Long getId() {
        return null;
    }
}
