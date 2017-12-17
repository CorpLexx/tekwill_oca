package practice_Interface.animal;

public class Dog implements Animal, Wild{
    public void walk(){
        System.out.println("Dog can walk");
    }

    public void eat(){
        System.out.println("Dog can eat");
    }

    public void fly(){
        System.out.println("Dog can't fly");
    }

    public boolean jump(){
        return true;
    }

    public boolean hasHair(){
        return true;
    }

    public boolean canAtackHuman(){
        return true;
    }
}
