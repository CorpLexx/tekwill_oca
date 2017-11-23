public class Person {

    private String name;
    private String surname;
    private int age;
    private double height;

    // Default constructor declared explicit
    public Person(){

    }

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age){
        this(name, surname); //Call upper constructor with 2 parameter
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname() {
        return surname;
    }

    public String toString(){
        String s = "age: " + age + " \nname " + name;
        return s;
    }
}
