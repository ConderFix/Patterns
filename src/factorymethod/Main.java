package factorymethod;

import factorymethod.logger.Logger;
import factorymethod.logger.LoggerFactory;

public class Main {

    public static void main(String[] args) {
        final Logger loggerConsole = LoggerFactory.getLogger("console");
        loggerConsole.log("Hello World!");

        final Logger loggerPlayer = LoggerFactory.getLogger("player");
        loggerPlayer.log("Hello World!");
    }
}
