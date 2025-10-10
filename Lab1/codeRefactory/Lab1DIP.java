interface Switchable {
    void turnOn();
    void turnOff();
}

class LightBulb implements Switchable {
    public void turnOn() {
        System.out.println("Bóng đèn bật");
    }

    public void turnOff() {
        System.out.println("Bóng đèn tắt");
    }
}

class Fan implements Switchable {
    public void turnOn() {
        System.out.println("Quạt bật");
    }

    public void turnOff() {
        System.out.println("Quạt tắt");
    }
}

class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate(boolean on) {
        if (on) device.turnOn();
        else device.turnOff();
    }
}
