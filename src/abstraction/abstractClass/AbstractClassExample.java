package abstraction.abstractClass;

public class AbstractClassExample {
    public static void main(String[] args) {
        Bike obj = new Pulsar();
        obj.run();

        Bike obj1 = new Honda();
        obj1.doStuff();
    }
}
