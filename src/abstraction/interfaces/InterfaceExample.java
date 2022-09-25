package abstraction.interfaces;

public class InterfaceExample {
    public static void main(String[] args) {

        Printable obj=new A6();
        A6 a6=new A6();
        obj.print();

        System.out.println("Value of num of the interface "+Printable.num);
        System.out.println("Value of num of the class "+obj.num);
        System.out.println("Value of num of the class "+a6.num);

    }
}