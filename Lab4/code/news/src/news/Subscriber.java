package news;

public class Subscriber implements Observer {
    private final String name;

    public Subscriber(String name) { this.name = name; }

    @Override
    public void update(News news) {
        System.out.printf("[Subscriber: %s] nhận bài mới: %s%n", name, news.title());
    }
}
