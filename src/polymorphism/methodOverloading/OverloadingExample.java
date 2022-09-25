package polymorphism.methodOverloading;

public class OverloadingExample {

    public static void main(String[] args) {
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(11,11,11));
        System.out.println(Adder.add(12.3,12.6));
        System.out.println(Adder.add(12.3,12.6,20.3));
    }
}