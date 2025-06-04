package composite;

public class Button implements UComponent {
    @Override
    public void render() {
        System.out.println("Render button...");
    }
}
