public class ManipulatingNumbers {
    public static void main(String[] args) {
        String custName = "Jora";
        int quantity = 3;
        String custItem = " wants to buy " + quantity +" potatoes.";
        String message = custName + custItem;

        double price = 10.0;
        double tax = 2.4;
        double total;
        total = price * quantity * tax;

        System.out.println(message);
        System.out.println("Total cost with tax is " + total + "$");

        int one = 0x413;
        int two = 2;
        System.out.println(one + two);
    }
}
