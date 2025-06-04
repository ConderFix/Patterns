package composite;

import java.util.ArrayList;
import java.util.List;

public class Panel implements UComponent {

    private final List<UComponent> components = new ArrayList<>();

    public void addComponent(UComponent uComponent) {
        this.components.add(uComponent);
    }

    public void removeComponent(UComponent uComponent) {
        this.components.remove(uComponent);
    }

    @Override
    public void render() {
        components.forEach(UComponent::render);
    }
}
