package news;

public class CNNAgency extends NewsAgency {
    public CNNAgency() { super("CNN"); }

    @Override
    protected News createNews(NewsType type) {
        switch (type) {
            case POLITICS:
                return new PoliticsNews("CNN Politics: Election Update",
                        "Latest polling numbers and debates analysis from CNN.");
            case SPORTS:
                return new SportsNews("CNN Sports: Finals Highlight",
                        "An incredible comeback seals the championship.");
            case TECH:
                return new TechNews("CNN Tech: AI Breakthrough",
                        "New model sets state-of-the-art benchmarks.");
            default: return null;
        }
    }
}
