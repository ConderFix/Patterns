package prototype;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        final Car car = new Bugatti(2021, "Divo", Color.WHITE);
        System.out.println(car);

        final Car car1 = (Car) car.clone();
        System.out.println(car1);
    }
}
