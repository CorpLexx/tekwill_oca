package create_methods;

public class Item {
    char color;
    String desc;
    double price;
    int quantity;

    boolean setColor(char newColor) {
        if (newColor == ' '){
            return false;
        }
        this.color = newColor;
        return true;
    }

    void setItemFields(String newDesc, double newPrice, int newQuantity){
        this.desc = newDesc;
        this.price = newPrice;
        this.quantity = newQuantity;
    }

    int setItemFields(String newDesc, double newPrice, int newQuantity, char newColor){
        if (setColor(newColor)){
            this.color = newColor;
        } else {
            return -1;
        }
        this.desc = newDesc;
        this.price = newPrice;
        this.quantity = newQuantity;
        return 1;
    }

    void displayItem(){
        System.out.println("Item: " + desc +
                            ", color: " + color +
                            ", quantity: " + quantity +
                                ", price: " + price + "$");
    }
}
