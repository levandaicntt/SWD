package device;

import java.util.ArrayList;
import java.util.List;

import observer.Subject;
import observer.Observer;

public abstract class Device implements Subject {
    protected final String name;
    private final List<Observer> observers = new ArrayList<>();
    private boolean on;

    protected Device(String name){ this.name = name; }

    public void turnOn(){ on = true; setStatus(name + " -> ON"); }
    public void turnOff(){ on = false; setStatus(name + " -> OFF"); }
    public String getStatus(){ return name + (on? " [ON]":" [OFF]"); }

    protected void setStatus(String s){ notifyObserversWith(s); }

    @Override public void attach(Observer o){ observers.add(o); }
    @Override public void detach(Observer o){ observers.remove(o); }
    @Override public void notifyObservers(){ notifyObserversWith(getStatus()); }

    protected void notifyObserversWith(String msg){
        for (Observer o : observers) o.update(msg);
    }
}