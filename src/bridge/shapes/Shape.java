package bridge.shapes;

import bridge.colors.Color;
import lombok.Getter;
import lombok.Setter;

public abstract class Shape {

    private final Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();

    public void applyColor() {
        color.applyColor();
        System.out.println("Я теперь " + color);
    }
}
