interface Flyable {
    void fly();
}

class Bird {
    public void eat() {
        System.out.println("Chim đang ăn...");
    }
}

class Sparrow extends Bird implements Flyable {
    public void fly() {
        System.out.println("Chim sẻ đang bay...");
    }
}

class Ostrich extends Bird {
    // Không implement Flyable vì đà điểu không thể bay
}
