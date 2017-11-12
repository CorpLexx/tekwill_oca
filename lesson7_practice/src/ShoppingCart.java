public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.descr = "Made in China";
        Item item2 = new Item();
        item2.descr = "Made in USA";
        System.out.println(item1.descr);
        System.out.println(item2.descr);
        System.out.println("----------------------");
        item1 = item2;
        System.out.println(item1.descr);
        System.out.println(item2.descr);
    }
}
