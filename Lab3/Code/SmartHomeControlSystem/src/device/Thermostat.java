package device;

public class Thermostat extends Device {
    private int temp = 24;
    public Thermostat(String name){ super(name); }
    public void setTemperature(int t){
        this.temp = t;
        setStatus(name + " set temp = " + temp + "°C");
    }
}