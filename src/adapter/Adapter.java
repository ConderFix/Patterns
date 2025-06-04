package adapter;

public class Adapter implements Socket {

    private final UsbCharger usbCharger;

    public Adapter(UsbCharger usbCharger) {
        this.usbCharger = usbCharger;
    }

    @Override
    public void charge() {
        usbCharger.chargeWithUsb();
    }
}
