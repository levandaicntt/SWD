package hub;

import device.Camera;
import device.Device;
import device.Light;
import device.Thermostat;
import factory.DeviceFactory;
import factory.PhilipsFactory;
import factory.XiaomiFactory;
import observer.Dashboard;

public class DemoMain {
    public static void main(String[] args) {
        var hub = SmartHomeHub.getInstance();

        // Đăng ký hãng (có thể thay đổi lúc runtime)
        hub.registerFactory("philips", new PhilipsFactory());
        hub.registerFactory("xiaomi",  new XiaomiFactory());

        // Tạo dashboard & thiết bị
        var db = new Dashboard("Home");

        Device l1 = hub.createDevice("light", "philips", "Living Light");
        Device t1 = hub.createDevice("thermostat", "xiaomi", "Bedroom Thermo");
        Device c1 = hub.createDevice("camera", "philips", "Front Camera");

        // Đăng ký quan sát
        l1.attach(db); t1.attach(db); c1.attach(db);

        // Tác vụ điều khiển
        l1.turnOn();
        ((Thermostat)t1).setTemperature(26);
        ((Camera)c1).startRecording();
        l1.turnOff();

        // Thêm hãng mới (ví dụ runtime)
        hub.registerFactory("samsung", new DeviceFactory() {
            public Device createLight(String n){ return new Light("Samsung " + n); }
            public Device createThermostat(String n){ return new Thermostat("Samsung " + n); }
            public Device createCamera(String n){ return new Camera("Samsung " + n); }
        });
        Device sLight = hub.createDevice("light", "samsung", "Kitchen Light");
        sLight.attach(db);
        sLight.turnOn();
    }
}