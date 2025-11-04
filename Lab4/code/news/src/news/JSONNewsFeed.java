package news;

import java.util.Arrays;
import java.util.List;

public class JSONNewsFeed {

    public static class FeedItem {
        public final String type;  
        public final String title;
        public final String content;

        public FeedItem(String type, String title, String content) {
            this.type = type; this.title = title; this.content = content;
        }
    }

    public List<FeedItem> fetchJSONNews() {
        return Arrays.asList(
            new FeedItem("sports",   "Feed Sports: Rising Star",
                    "Rookie scores hat-trick in debut."),
            new FeedItem("tech",     "Feed Tech: Browser Engine",
                    "New engine promises speed and privacy."),
            new FeedItem("politics", "Feed Politics: Summit",
                    "Leaders agree on climate roadmaps.")
        );
    }
}
