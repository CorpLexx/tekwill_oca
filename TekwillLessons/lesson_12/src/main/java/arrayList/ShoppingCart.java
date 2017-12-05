package arrayList;

// Practice 12_3
public class ShoppingCart {

    Item[] item;

    public ShoppingCart(Item[] clothes) {
        this.item = clothes;
    }

    public void displayTotal(){
        double total = 0;
        for (int i = 0; i < item.length; i++){
            if (!item[i].isOutOfOrder()){
                continue;
            }
            total += item[i].getPrice();
        }
        System.out.println("Shopping Cart total price: " + total + "$\n");
    }
}