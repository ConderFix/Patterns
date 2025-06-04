package command;

import lombok.Getter;

public class Light {
    @Getter
    private boolean state;

    public void on() {
        state = true;
        System.out.println("Light on");
    }

    public void off() {
        state = false;
        System.out.println("Light off");
    }
}
