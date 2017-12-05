package condition;

public class ShoppingCart {
    public static void main(String[] args) {
        int x = 3, y = 10;
        x = ((y/x) < 3) ? x+y : x*y;
        System.out.println(x);

        Order order1 = new Order();
        System.out.println("Nonprofit discount: " + order1.calcDiscountIf("nonprofit", 1000));
        System.out.println("Private discount: " + order1.calcDiscountSwitch("private", 100));
        System.out.println("Corporate discount: " + order1.calcDiscountIf("corporate", 1000));
        System.out.println("Ordinary " + order1.calcDiscountSwitch("ordinary client", 1000));


    }
}
