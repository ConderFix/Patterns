package bridge.colors.impls;

import bridge.colors.Color;

public class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Принял красный цвет");
    }
}
