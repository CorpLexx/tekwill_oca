/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package home_work;

public class ShoppingCart {
    public static void main(String args[]){ 
	// Instantiate a Shirt object and call display() on the object reference
        Item myShirt = new Shirt('S', 'B', 13.3);
        myShirt.display();
        Item myItem = new Item();

        if (myShirt instanceof Shirt){
            String color = ((Shirt)myShirt).getColor(((Shirt) myShirt).colorCode);
            System.out.println("Color of my shirt is: " + color);
        } else {
            System.out.println("Item is not a shirt");
        }
       
    }
}    
