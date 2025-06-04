package abstractfabric;

import abstractfabric.boss.ZombieBossFabric;
import abstractfabric.cargo.Cargo;
import org.w3c.dom.events.EventTarget;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        final EventFabric fabric = new ZombieBossFabric(
                "тест", 42, 42
        );
        final GameEvent event = fabric.createEevnt(new Vector<>());

        spawnEvent(event);
    }

    public static void spawnEvent(GameEvent event) {
        event.spawn(new Vector<>());
    }
}
