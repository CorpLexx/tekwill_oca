package frecventa.impl;

public class Student extends Staff {


    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public String getRoleName() {
        return "Student";
    }
}
