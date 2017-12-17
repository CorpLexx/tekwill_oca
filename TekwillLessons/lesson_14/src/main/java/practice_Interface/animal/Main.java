package practice_Interface.animal;

public class Main {
    public static void main(String[] args) {
        Animal catAnimal = new Cat();
        Animal dogAnimal = new Dog();

        catAnimal.walk();
        catAnimal.eat();
        catAnimal.fly();
        catAnimal.jump();

    }
}
