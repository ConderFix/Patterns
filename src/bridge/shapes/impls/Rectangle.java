package bridge.shapes.impls;

import bridge.colors.Color;
import bridge.shapes.Shape;

public class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Рисую треугольник");
    }
}
