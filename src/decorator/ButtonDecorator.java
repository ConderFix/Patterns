package decorator;


public abstract class ButtonDecorator extends Button {
    protected Button button;

    protected ButtonDecorator(Button button) {
        this.button = button;
    }

    @Override
    public void render() {
        button.render();
    }
}
