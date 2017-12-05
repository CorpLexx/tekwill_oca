package arrayList;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Practice 12_1 working with date
        LocalDateTime orderDate = LocalDateTime.now();
        System.out.println(orderDate);
        String formattedOrderDate = orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(formattedOrderDate+ "\n");

        // Practice 12_2 display args
        if (args.length < 2){
            System.out.println("2 arguments are required\n");
        } else {
            String arg0 = args[0];
            int arg1 = Integer.parseInt(args[1]);
            System.out.println(arg0 + ", " + arg1 + " years old\n");
        }

        // Practice 12_3 iterate Array
        Item cap = new Item("Cap", true, 10);
        Item trousers = new Item("Trousers", false, 33.2);
        Item pullover = new Item("Pullover", true, 15.3);
        Item[] clothes = {cap, trousers, pullover};
        ShoppingCart shoppingCart = new ShoppingCart(clothes);
        shoppingCart.displayTotal();

        // Practice 12_4 ArrayList
        ArrayList<String> things = new ArrayList<>();
        things.add("Car");
        things.add("House");
        things.add("Table");
        things.add("Phone");
        things.add("Clock");
        System.out.println(things);
        things.add(2, "Bed");
        System.out.println(things);
        if (things.contains("Phone")){
            things.remove("Phone");
        } else {
            System.out.println("Nothing to remove!");
        }
        System.out.println(things);

        Calc calculator = new Calc();

        System.out.println("Suma argumentelor este: " + calculator.sum(args));
        System.out.println("Media argumentelor este: " + calculator.media(args));
        System.out.println("Produsul argumentelor este: " + calculator.produs(args));

        System.out.println("Suma: " + calculator.operation(args, "sum"));
        System.out.println("Media: " + calculator.operation(args, "media"));
        System.out.println("Produs: " + calculator.operation(args, "produs"));
    }
}