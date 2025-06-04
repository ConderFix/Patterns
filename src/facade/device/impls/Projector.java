package facade.device.impls;

import facade.device.Device;

public class Projector implements Device {
    @Override
    public void on() {
        System.out.println("Projector on");
    }

    @Override
    public void off() {
        System.out.println("Projector off");
    }
}
