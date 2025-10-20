package hub;

import java.util.HashMap;
import java.util.Map;

import device.Device;
import factory.DeviceFactory;

public class SmartHomeHub {
    private static SmartHomeHub instance;
    private final Map<String, DeviceFactory> factories = new HashMap<>();

    private SmartHomeHub() {}

    public static synchronized SmartHomeHub getInstance(){
        if(instance == null) instance = new SmartHomeHub();
        return instance;
    }

    public void registerFactory(String brand, DeviceFactory f){
        factories.put(brand.toLowerCase(), f);
    }

    public Device createDevice(String type, String brand, String name){
        DeviceFactory f = factories.get(brand.toLowerCase());
        if(f == null) throw new IllegalArgumentException("No factory for brand: " + brand);
        return switch (type.toLowerCase()){
            case "light" -> f.createLight(name);
            case "thermostat" -> f.createThermostat(name);
            case "camera" -> f.createCamera(name);
            default -> throw new IllegalArgumentException("Unknown type: " + type);
        };
    }
}	