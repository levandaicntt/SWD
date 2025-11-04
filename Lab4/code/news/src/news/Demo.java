package news;

public class Demo {
    public static void main(String[] args) {
        Subscriber alice = new Subscriber("Alice");
        Subscriber bob   = new Subscriber("Bob");
        Subscriber chi   = new Subscriber("Chi");

        NewsAgency cnn  = new CNNAgency();
        NewsAgency bbc  = new BBCAgency();
        NewsAgency feed = new JSONNewsAdapter(new JSONNewsFeed());

        cnn.attach(alice);
        cnn.attach(bob);

        bbc.attach(bob);
        bbc.attach(chi);

        feed.attach(alice);
        feed.attach(bob);
        feed.attach(chi);

        cnn.publishNews("sports");
        bbc.publishNews("tech");
        cnn.publishNews("politics");

        feed.publishNews("ignored");

        System.out.println("\n--- Sample display ---");
        new TechNews("Ad-hoc Display", "This is a manual display call").display();
    }
}
