package factory;

import device.Device;

public interface DeviceFactory {
    Device createLight(String name);
    Device createThermostat(String name);
    Device createCamera(String name);
}