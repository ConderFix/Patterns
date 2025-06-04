package facade.device.impls;

import facade.device.Device;

public class SoundSystem implements Device {

    @Override
    public void on() {
        System.out.println("Sound on");
    }

    @Override
    public void off() {
        System.out.println("Sound off");
    }
}
