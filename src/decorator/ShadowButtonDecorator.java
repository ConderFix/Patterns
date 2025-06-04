package decorator;

public class ShadowButtonDecorator extends ButtonDecorator {

    public ShadowButtonDecorator(Button button) {
        super(button);
    }

    @Override
    public void render() {
        super.render();
        this.renderShadow();
    }

    public void renderShadow() {
        System.out.println("Render button shadow");
    }
}
