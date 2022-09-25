package polymorphism.methodOverriding;

class Screen {

    public void display() {
        System.out.println("The NON-static method from parent class");
    }

    /*
     * public static method which can not be overridden in Java
     */
    public static void show() {
        System.out.println("The static method from parent class");
    }
}
