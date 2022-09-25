package abstraction.abstractClass;

class Honda extends Bike {

    @Override
    void run() {
        System.out.println("Honda running safely");
    }

    @Override
    public void doStuff() {
        System.out.println("Overriding BaseClass Do Stuff");
    }
}
