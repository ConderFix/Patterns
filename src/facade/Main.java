package facade;

import lombok.SneakyThrows;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        final HomeTheaterFacade facade = new HomeTheaterFacade();
        facade.watchMovie("Batmen");
        Thread.sleep(3000);
        facade.endMovie();
    }
}
