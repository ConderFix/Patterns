package command;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LightToggleCommand implements Command {

    private Boolean oldState = null;
    private final Light light;

    @Override
    public void execute() {
        oldState = light.isState();
        if (oldState) {
            light.off();
        } else {
            light.on();
        }
    }

    @Override
    public void undo() {
        if (oldState == null) throw new IllegalStateException("Command not executed");

        if (oldState) {
            light.on();
        } else {
            light.off();
        }
    }
}
