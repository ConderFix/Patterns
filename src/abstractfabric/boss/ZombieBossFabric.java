package abstractfabric.boss;

import java.util.Vector;

public class ZombieBossFabric extends BossFabric<ZombieBoss> {

    public ZombieBossFabric(String name, int hp, int damage) {
        super(name, hp, damage);
    }

    @Override
    public ZombieBoss createEevnt(Vector<?> location) {
        return this;
    }
}
