package adapter;

public class Main {
    public static void main(String[] args) {
        final UsbCharger usbCharger = new UsbCharger();
        final Adapter adapter = new Adapter(usbCharger);

        adapter.charge();
    }
}
