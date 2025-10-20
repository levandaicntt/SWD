package device;

public class Camera extends Device {
    public Camera(String name){ super(name); }
    public void startRecording(){ setStatus(name + " started recording"); }
}