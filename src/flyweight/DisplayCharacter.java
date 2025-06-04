package flyweight;

public class DisplayCharacter {

    private final char symbol;
    private final String font;
    private final int size;
    private final String color;

    public DisplayCharacter(char symbol, String font, int size, String color) {
        this.symbol = symbol;
        this.font = font;
        this.size = size;
        this.color = color;
    }

    public void draw(int x, int y) {
        System.out.println(x + "," + y);
    }
}
