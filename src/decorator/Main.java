package decorator;

public class Main {
    public static void main(String[] args) {
        final UComponent button1 = new ShadowButtonDecorator(new Button());
        final UComponent button2 = new Button();
        final UComponent textField = new TextField("Test");

        final Panel panel = new Panel();
        panel.addComponent(textField);
        panel.addComponent(button2);
        panel.addComponent(button1);

        panel.render();
    }
}
