package delegationvsInheritance;

// Java program to illustrate
// Inheritance
class RealPrinter1 {
    // base class implements method
    void print() {
        System.out.println("Printing Data");
    }
} // Printer Inheriting functionality of real printer

class Printer1 extends RealPrinter1 {

    void print() {
        super.print(); // inside calling method of parent
    }
}

public class InheritanceExample {
    // To the outside world it looks like Printer actually prints.
    public static void main(String[] args) {
        Printer1 printer = new Printer1();
        printer.print();
    }
}
