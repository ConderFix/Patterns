package bridge;

import bridge.colors.Color;
import bridge.colors.impls.BlueColor;
import bridge.colors.impls.RedColor;
import bridge.shapes.Shape;
import bridge.shapes.impls.Circle;
import bridge.shapes.impls.Rectangle;

public class Main {

    public static void main(String[] args) {
        final Color redColor = new RedColor();
        final Shape rectangle = new Rectangle(redColor);

        rectangle.applyColor();
        rectangle.draw();

        final Color blueColor = new BlueColor();
        final Shape circle = new Circle(blueColor);

        circle.applyColor();
        circle.draw();
    }
}
