package news;

public class BBCAgency extends NewsAgency {
    public BBCAgency() { super("BBC"); }

    @Override
    protected News createNews(NewsType type) {
        switch (type) {
            case POLITICS:
                return new PoliticsNews("BBC Politics: Parliament Session",
                        "Key bills discussed with cross-party reactions.");
            case SPORTS:
                return new SportsNews("BBC Sport: Derby Day",
                        "Local rivals share points in a thrilling draw.");
            case TECH:
                return new TechNews("BBC Tech: Quantum Leap",
                        "Startups race to build error-corrected qubits.");
            default: return null;
        }
    }
}
