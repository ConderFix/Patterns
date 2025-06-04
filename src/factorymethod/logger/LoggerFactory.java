package factorymethod.logger;

import factorymethod.logger.impls.ConsoleLogger;
import factorymethod.logger.impls.PlayerLogger;

public class LoggerFactory {

    public static Logger getLogger(String type) {
        return switch (type.toLowerCase()) {
            case "console" -> new ConsoleLogger();
            case "player" -> new PlayerLogger();
            default -> throw new IllegalArgumentException("Unknown logger type");
        };
    }
}
