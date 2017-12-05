package encapsulation;

public class Customer {
    private String name;
    private int ssn;

    Customer(String newName){
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSsn() {
        return ssn;
    }
}
