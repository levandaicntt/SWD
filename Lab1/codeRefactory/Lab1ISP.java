interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Human implements Workable, Eatable {
    public void work() {
        System.out.println("Con người đang làm việc...");
    }

    public void eat() {
        System.out.println("Con người đang ăn...");
    }
}

class Robot implements Workable {
    public void work() {
        System.out.println("Robot đang làm việc...");
    }
}
