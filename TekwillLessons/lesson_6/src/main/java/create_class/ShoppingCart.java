package create_class;

public class ShoppingCart {
    public static void main(String[] args) {
        Item shirt = new Item();
        Item cap = new Item();
        shirt.descr = "Shirt";
        cap.descr = "Cap";

        System.out.println(shirt.descr);
        System.out.println(cap.descr);
        System.out.println("--------------");
        shirt = cap;
        System.out.println(shirt.descr);
        System.out.println(cap.descr);
    }
}
