package arrayList;

// Practice 12_3
public class Item {

    private String name;
    private boolean isInStock;
    private double price;

    public Item(String name, boolean isInStock, double price) {
        this.name = name;
        this.isInStock = isInStock;
        this.price = price;
    }

    public boolean isOutOfOrder(){
        return this.isInStock;
    }

    public double getPrice() {
        return price;
    }
}