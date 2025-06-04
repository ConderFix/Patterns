package abstractfabric.cargo;

import java.util.Vector;

public class DeadlyCargo implements Cargo{
    @Override
    public int getRegionRadius() {
        return 0;
    }

    @Override
    public void spawn(Vector<?> location) {

    }
}
