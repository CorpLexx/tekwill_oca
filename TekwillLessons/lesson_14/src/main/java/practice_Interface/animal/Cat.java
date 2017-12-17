package practice_Interface.animal;

public class Cat implements Animal{
    public void walk(){
        System.out.println("Cat can walk");
    }

    public void eat(){
        System.out.println("Cat can eat");
    }

    public void fly(){
        System.out.println("Cat can't fly");
    }

    public boolean jump(){
        return true;
    }

    public boolean hasHair(){
        return true;
    }

}
