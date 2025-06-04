package abstractfabric;

import java.util.Vector;

public interface EventFabric {
    GameEvent createEevnt(Vector<?> location);
}
