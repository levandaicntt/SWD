package news;

import java.util.ArrayList;
import java.util.List;

public abstract class NewsAgency implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    protected final String name;

    protected NewsAgency(String name) { this.name = name; }

    protected abstract News createNews(NewsType type);

    public void publishNews(String type) {
        NewsType t = NewsType.from(type);
        if (t == null) {
            System.out.printf("[%s] Loại tin không hợp lệ: %s%n", name, type);
            return;
        }
        News news = createNews(t);
        if (news != null) {
            System.out.printf("[%s] Publish: %s%n", name, news.title());
            notifyObservers(news);
        }
    }

    @Override public void attach(Observer o)   { observers.add(o); }
    @Override public void detach(Observer o)   { observers.remove(o); }
    @Override public void notifyObservers(News news) {
        for (Observer o : observers) o.update(news);
    }

    public String getName() { return name; }
}
