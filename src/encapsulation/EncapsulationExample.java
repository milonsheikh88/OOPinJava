package encapsulation;

public class EncapsulationExample {
    public static void main(String[] args) {
        Student obj = new Student();

        // setting values of the variables
        obj.setStudentName("Harsh");
        obj.setAge(19);
        obj.setRoll(51);

        // Displaying values of the variables
        System.out.println("Student's name: " + obj.getStudentName());
        System.out.println("Student's age: " + obj.getAge());
        System.out.println("Student's roll: " + obj.getRoll());
        System.out.println("Student's Unique Key: " + obj.getUniqueKey());
    }
}
