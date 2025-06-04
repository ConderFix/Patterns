package factorymethod.logger.impls;

import factorymethod.logger.Logger;

public class ConsoleLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("[Console] " + message);
    }
}
