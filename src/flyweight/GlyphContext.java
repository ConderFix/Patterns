package flyweight;

public class GlyphContext {

    private final int x;
    private final int y;
    private final DisplayCharacter displayCharacter;

    public GlyphContext(int x, int y, DisplayCharacter displayCharacter) {
        this.x = x;
        this.y = y;
        this.displayCharacter = displayCharacter;
    }

    public void draw() {
        displayCharacter.draw(x, y);
    }
}
