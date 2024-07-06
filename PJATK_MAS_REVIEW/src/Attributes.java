import org.jetbrains.annotations.Nullable;

import java.time.LocalDate;
import java.util.List;

public class Attributes {

    // plain attribute - primitive
    private float price;

    // complex attribute
    private LocalDate localDate;

    // optional - if an object we should be aware it can be a null
    @Nullable // only an annotation to inform a user about possible null value
    private LocalDate birthday = null;

    // repeatable
    private List<Object> objects;

    // class - if an extent is implemented in the same class - static
    private static int maxSalary;

    // class - if an extent is implemented as an additional class - not static
    private int maxSalary2;

    // derived attribute
    @Nullable
    public Integer getAge() {
        return birthday != null ? LocalDate.now().getYear() - birthday.getYear() : null;
    }

}
