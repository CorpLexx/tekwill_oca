package frecventa.impl;

public class Professor extends Staff {


    public Professor(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }


    @Override
    public String  getRoleName() {
        return "Professor";
    }
}
