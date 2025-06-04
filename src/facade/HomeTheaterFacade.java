package facade;

import facade.device.impls.DVDPlayer;
import facade.device.impls.Light;
import facade.device.impls.Projector;
import facade.device.impls.SoundSystem;

public class HomeTheaterFacade {
    private final Light light = new Light();
    private final SoundSystem soundSystem = new SoundSystem();
    private final Projector projector = new Projector();
    private final DVDPlayer dvdPlayer = new DVDPlayer();

    public void watchMovie(String movie) {
        System.out.println("Preparing to watch a movie...");
        light.off();
        soundSystem.on();
        projector.on();
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("End of the session...");

        light.on();
        soundSystem.off();
        projector.off();
        dvdPlayer.off();
    }
}
