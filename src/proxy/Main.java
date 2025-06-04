package proxy;

import lombok.SneakyThrows;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        final Image image = new ProxyImage("test.png");

        image.display();
    }
}
