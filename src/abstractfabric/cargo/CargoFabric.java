package abstractfabric.cargo;

import abstractfabric.EventFabric;

import java.awt.*;
import java.util.Vector;

public abstract class CargoFabric<C extends Cargo> implements EventFabric {

    protected final String blockMaterial;

    protected CargoFabric(String blockMaterial) {
        this.blockMaterial = blockMaterial;
    }

    @Override
    public abstract C createEevnt(Vector<?> location);
}
