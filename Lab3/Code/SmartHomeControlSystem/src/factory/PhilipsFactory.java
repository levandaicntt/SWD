package factory;

import device.Camera;
import device.Device;
import device.Light;
import device.Thermostat;

public class PhilipsFactory implements DeviceFactory {
    @Override public Device createLight(String name){ return new Light("Philips " + name); }
    @Override public Device createThermostat(String name){ return new Thermostat("Philips " + name); }
    @Override public Device createCamera(String name){ return new Camera("Philips " + name); }
}