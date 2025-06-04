package flyweight;

import java.util.HashMap;
import java.util.Map;

public class DisplayCharacterFactory {
    final Map<Character, DisplayCharacter> displayCharacters = new HashMap<>();

    private final String font;
    private final String color;
    private final int size;

    public DisplayCharacterFactory(String font, String color, int size) {
        this.font = font;
        this.color = color;
        this.size = size;
    }

    public DisplayCharacter getDisplayCharacter(char c) {
        return displayCharacters.computeIfAbsent(c, key -> new DisplayCharacter(c, font, size, color));
    }
}
