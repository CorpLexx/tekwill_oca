package create_methods;

public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();
        boolean boolColor = item1.setColor('R');

        if(boolColor){
            System.out.println("Color is: " + item1.color);
        } else {
            System.out.println("Undefine color");
        }

        Item item2 = new Item();
        item2.setItemFields("Shirt", 23, 2);
        item2.displayItem();
        if (item2.setItemFields("T-shirt", 25,
                                    5, 'B') < 0){
            System.out.println("Invalid color");
        } else {
            item2.displayItem();
        }

    }
}
