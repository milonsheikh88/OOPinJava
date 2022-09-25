package polymorphism.methodOverriding;

class ColorScreen extends Screen {
    @Override
    public void display() {
        System.out.println("The NON-static method from Child class");
    }

    /*
     * static method of the same name and method signature
     * as existed in super
     * class, this is not method overriding instead this is called
     * method hiding in Java
     */
    public static void show() {
        System.out.println("Overridden static method in Child Class in Java");
    }
}
