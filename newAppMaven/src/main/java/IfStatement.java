import java.util.Arrays;

public class IfStatement {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(args));

        int quantity = 0;
        int cost = 7;
        int totalCost = cost * quantity;
        String message = "We have " + quantity + " item";
        boolean outOfStock = false;

        if (outOfStock || quantity <= 0) {
            System.out.println("Item is unavailable");
        } else {
            if (quantity > 1) {
                System.out.println(message + "s with totalCost: " + totalCost + "$");
            } else {
                System.out.println(message + " with totalCost: " + totalCost + "$");
            }
        }
    }
}