package oracle.practice_8;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car2 car2 = new Car2();

        car1.setColor('A');

        car1.setMase(Car2.DEFAUL_MASS);
        car1.setMase(11);

        System.out.println(Car.getMase());
    }
}
