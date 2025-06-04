package bridge.colors.impls;

import bridge.colors.Color;

public class BlueColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Принял синий цвет");
    }
}
