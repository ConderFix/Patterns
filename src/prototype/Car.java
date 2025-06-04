package prototype;

import lombok.ToString;

@ToString
public abstract class Car implements Cloneable {

    private final int year;
    private final String model;

    protected Car(int year, String model) {
        this.year = year;
        this.model = model;
    }

    protected Car(Car car) {
        this.year = car.year;
        this.model = car.model;
    }

    @Override
    public abstract Object clone();
}
