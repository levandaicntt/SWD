package observer;

public class Dashboard implements Observer {
    private final String name;
    public Dashboard(String name){ this.name = name; }
    @Override public void update(String status) {
        System.out.println("[Dashboard " + name + "] " + status);
    }
}