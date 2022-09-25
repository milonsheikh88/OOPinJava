package polymorphism.methodOverriding;

public class OverridingExample {

    public static void main(String args[]) {
        Screen scrn = new ColorScreen();
        scrn.display();

        // As per overriding rules this should call to class ColorScreen's display().
        // overridden method. Since static method can not be overridden, it
        // calls Screen's display()
        scrn.show();
    }
}

