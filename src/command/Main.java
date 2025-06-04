package command;

import lombok.SneakyThrows;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        final Light light = new Light();
        final Command command = new LightToggleCommand(light);

        command.execute();
        Thread.sleep(2000);
        command.undo();
    }
}
