package composite;

import java.awt.*;

public class TextField implements UComponent {

    private final String placeholder;

    public TextField(String placeholder) {
        this.placeholder = placeholder;
    }

    @Override
    public void render() {
        System.out.println("Render text: " + placeholder);
    }
}
