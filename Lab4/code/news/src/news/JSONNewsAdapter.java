package news;

import java.util.List;

public class JSONNewsAdapter extends NewsAgency {

    private final JSONNewsFeed feed;

    public JSONNewsAdapter(JSONNewsFeed feed) {
        super("JSONAdapter");
        this.feed = feed;
    }

    @Override
    protected News createNews(NewsType type) {
        switch (type) {
            case POLITICS: return new PoliticsNews("Feed Default Politics", "Default content");
            case SPORTS:   return new SportsNews("Feed Default Sports", "Default content");
            case TECH:     return new TechNews("Feed Default Tech", "Default content");
            default:       return null;
        }
    }

    @Override
    public void publishNews(String type) {
        System.out.println("[JSONAdapter] Fetching from JSON feed...");
        List<JSONNewsFeed.FeedItem> items = feed.fetchJSONNews();
        for (JSONNewsFeed.FeedItem it : items) {
            NewsType t = NewsType.from(it.type);
            News news = toDomainNews(t, it.title, it.content);
            System.out.printf("[JSONAdapter] Publish: %s%n", news.title());
            notifyObservers(news);
        }
    }

    private News toDomainNews(NewsType t, String title, String content) {
        if (t == null) return new TechNews(title, content);
        switch (t) {
            case POLITICS: return new PoliticsNews(title, content);
            case SPORTS:   return new SportsNews(title, content);
            case TECH:     return new TechNews(title, content);
            default:       return new TechNews(title, content);
        }
    }
}
