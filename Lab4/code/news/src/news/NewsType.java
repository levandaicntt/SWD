package news;

public enum NewsType {
    POLITICS, SPORTS, TECH;

    public static NewsType from(String s) {
        if (s == null) return null;
        switch (s.trim().toLowerCase()) {
            case "politics": return POLITICS;
            case "sports":   return SPORTS;
            case "tech":     return TECH;
            default:         return null;
        }
    }
}
