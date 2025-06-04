package abstractfabric.boss;

import abstractfabric.EventFabric;
import abstractfabric.GameEvent;

import java.util.Vector;

public abstract class BossFabric<B extends Boss> implements EventFabric {
    protected final String name;
    protected final int hp;
    protected final int damage;

    protected BossFabric(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    @Override
    public abstract B createEevnt(Vector<?> location);
}
