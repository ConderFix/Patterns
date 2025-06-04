package flyweight;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        final List<GlyphContext> glyphs = new ArrayList<>();

        final String text = "A very long text with many repeated characters, but each one is unique in memory!";
        final String font = "Arial";
        final int size = 12;
        final String color = "Black";

        int x = 0;
        int y = 20;

        final DisplayCharacterFactory factory = new DisplayCharacterFactory(font, color, size);

        for (char c: text.toCharArray()) {
            final DisplayCharacter displayCharacter = factory.getDisplayCharacter(c);
            glyphs.add(new GlyphContext(x, y, displayCharacter));
            x += 15;
        }

        for (GlyphContext glyph : glyphs) {
            glyph.draw();
        }
    }
}
