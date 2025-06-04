package abstractfabric.cargo;

import java.awt.*;
import java.util.Vector;

public class NormalCargo implements Cargo {

    private final Color fireworkColor;
    private final String blockMaterial;

    public NormalCargo(Color fireworkColor, String blockMaterial) {
        this.fireworkColor = fireworkColor;
        this.blockMaterial = blockMaterial;
    }

    @Override
    public int getRegionRadius() {
        return 0;
    }

    @Override
    public void spawn(Vector<?> location) {

    }
}
