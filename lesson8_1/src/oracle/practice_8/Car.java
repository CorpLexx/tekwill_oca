package oracle.practice_8;

public class Car {
    private char color;
    private static int mase;

    public Car(){

    }

    public Car(char color) {
        this.color = color;
    }

    public boolean setColor(char color) {
        if (color == ' '){
            return false;
        }
        this.color = color;
        return true;
    }

    public static void setMase(int mase) {
        Car.mase = mase;
    }

    public static int getMase() {
        return Car.mase;
    }
}