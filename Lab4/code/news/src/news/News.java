package news;

public abstract class News {
    protected String title;
    protected String content;

    protected News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String title()   { return title; }
    public String content() { return content; }

    public void display() {
        System.out.printf("== %s ==%n%s%n%n", title, content);
    }
}
