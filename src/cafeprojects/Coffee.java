package cafeprojects;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Coffee extends Product {
    public boolean sugar = true;
    public boolean milk = true;
    public Double quantity = 0.0;
    public static Double coffeeSubtotal = 0.0;
    DecimalFormat df = new DecimalFormat("#.##");

    Scanner sc = new Scanner(System.in);

    public Coffee(String name, Double price, String description) {
        super(name, price, description);
        this.sugar = false;
        this.milk = false;
        this.price = price;
    }//Coffee extends Product

    //Methods
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public void addOptions() {
        System.out.println("Do you want sugar in your coffee?  Type \"true\" for yes, and \"false\" for no.");
        boolean sugar = sc.nextBoolean();
        this.setSugar(sugar);

        System.out.println("Do you want milk in your coffee? Type \"true\" for yes, and \"false\" for no.");
        boolean milk = sc.nextBoolean();
        this.setMilk(milk);
    }

    @Override
    public void printOptions(boolean sugar, boolean milk) {
        if(sugar) {Product.ShoppingCart.add("Sugar: Yes (No charge)");}
        if(milk) {Product.ShoppingCart.add("Milk: Yes (No charge)");}
        if(!sugar){Product.ShoppingCart.add("Sugar: No");}
        if(!milk){Product.ShoppingCart.add("Milk: No");}
    }

    public Double calculateCoffeeSubtotal() {
        this.coffeeSubtotal = price * quantity;
        Product.ShoppingCart.add("Coffee Subtotal: " + df.format(coffeeSubtotal));
        Product.ShoppingCart.add("-------------------------------------");
        return coffeeSubtotal;
    }

    @Override
    public void addToShoppingCartSubtotal() {
        Product.shoppingCartSubtotal += coffeeSubtotal;
    }

    //Getters and Setters
    public boolean getSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public boolean getMilk(boolean milk) {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }//Getters and Setters

}//Coffee class
