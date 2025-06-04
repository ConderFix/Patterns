package abstractfabric.cargo;

import java.awt.*;
import java.util.Vector;

public class NormalCargoFabric extends CargoFabric<NormalCargo> {

    private Color fireworkColor;

    public NormalCargoFabric(String blockMaterial, Color fireworkColor) {
        super(blockMaterial);
        this.fireworkColor = fireworkColor;
    }

    @Override
    public NormalCargo createEevnt(Vector<?> location) {
        return null;
    }
}
