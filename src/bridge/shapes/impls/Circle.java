package bridge.shapes.impls;

import bridge.colors.Color;
import bridge.shapes.Shape;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Рисую круг");
    }
}
