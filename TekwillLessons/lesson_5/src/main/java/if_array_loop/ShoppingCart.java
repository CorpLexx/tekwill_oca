package if_array_loop;

public class ShoppingCart {

    public static void main(String[] args) {
        System.out.println("Welcome to the Shopping Cart!");

        String custName = "Mary";

        double price = 7;
        int quantity = 3;
        double tax = quantity * price * 0.2;
        double total;

        total = quantity * price + tax;

        System.out.println("Total cost with tax is: " + total + "$");

        String message = custName + " wants to purchase " + quantity + " item";

        boolean outOfStock = false;

        if (outOfStock || quantity <= 0) {
            System.out.println("Item is unavailable");
        } else {
            if (quantity > 1) {
                System.out.println(message + "s with total cost: " + total + "$");
            } else {
                System.out.println(message + " with total cost: " + total + "$");
            }
        }

        custName = "John";
        String[] items = {"Shirt", "Cap", "Shoes", "T-shirt"};
        message = custName + " wants to purchase " + items.length + " item";

        outOfStock = false;
        total = items.length * price + tax;

        if (outOfStock || quantity <= 0) {
            System.out.println("Item is unavailable");
        } else {
            if (quantity > 1) {
                System.out.println(message + "s with total cost: " + total + "$");
            } else {
                System.out.println(message + " with total cost: " + total + "$");
            }
        }
        System.out.println("One of the items is: " + items[3]);

        for(String item : items) {
            System.out.println("Items purchased: " + item);
        }
    }
}
