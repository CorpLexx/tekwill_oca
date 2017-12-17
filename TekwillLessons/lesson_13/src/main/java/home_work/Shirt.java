package home_work;

public class Shirt extends Item {
    char size;
    char colorCode;

    public Shirt(char sizeValue, char colorCodeValue, double priceValue){
        super("Shirt", priceValue);
        this.size = sizeValue;
        this.colorCode = colorCodeValue;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Size of the shirt is: " + this.size);
        System.out.println("Color code of the shirt is: " + this.colorCode);
    }

    public String getColor(char colorCodeValue){
        String color;
        switch (colorCodeValue){
            case 'R':
                color = "Red";
                break;
            case 'B':
                color = "Black";
                break;
            case 'G':
                color = "Green";
                break;
                default:
                    color = "";
        }
        return color;
    }
}
