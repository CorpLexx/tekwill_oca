package string_and_number;

public class ShoppingCart {

    public static void main(String[] args) {
        System.out.println("Welcome to the Shopping Cart!");

        String custName = "Mary";
        String itemDesc = "Shirt";
        String message = custName + " wants to purchase a " + itemDesc;

        System.out.println(message);

        double price = 7;
        int quantity = 3;
        double tax = quantity * price * 0.2;
        double total;

        total = quantity * price + tax;

        System.out.println("Total cost with tax is: " + total + "$");



    }
}
