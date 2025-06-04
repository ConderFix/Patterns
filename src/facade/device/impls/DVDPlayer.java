package facade.device.impls;

import facade.device.Device;

public class DVDPlayer implements Device {

    @Override
    public void on() {
        System.out.println("DVDPlayer on");
    }

    @Override
    public void off() {
        System.out.println("DVDPlayer on");
    }

    public void play(String movie) {
        System.out.println("Playing a movie: " + movie);
    }
}
