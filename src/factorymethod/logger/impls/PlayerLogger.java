package factorymethod.logger.impls;

import factorymethod.logger.Logger;

public class PlayerLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("[Player] " + message);
    }
}
