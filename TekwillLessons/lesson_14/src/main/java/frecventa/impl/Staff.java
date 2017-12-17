package frecventa.impl;

import frecventa.api.Role;

public abstract class Staff extends Person implements Role{


    public Staff(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Role=")
                .append(getRoleName())
                .append(", {")
                .append(getFirstName())
                .append(", ")
                .append(getLastName())
                .append(", ")
                .append(getAge())
                .append("}");
        return sb.toString();
    }
}