package prototype;

import lombok.SneakyThrows;
import lombok.ToString;

import java.awt.*;

@ToString(callSuper = true)
public class Bugatti extends Car {
    private final Color color;

    public Bugatti(int year, String model, Color color) {
        super(year, model);
        this.color = color;
    }

    public Bugatti(Bugatti bugatti) {
        super(bugatti);
        this.color = bugatti.color;
    }

    @Override
    @SneakyThrows
    public Object clone() {
        return new Bugatti(this);
    }
}
