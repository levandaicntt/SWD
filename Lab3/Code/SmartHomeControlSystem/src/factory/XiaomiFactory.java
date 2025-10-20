package factory;

import device.Camera;
import device.Device;
import device.Light;
import device.Thermostat;

public class XiaomiFactory implements DeviceFactory {
    @Override public Device createLight(String name){ return new Light("Xiaomi " + name); }
    @Override public Device createThermostat(String name){ return new Thermostat("Xiaomi " + name); }
    @Override public Device createCamera(String name){ return new Camera("Xiaomi " + name); }
}