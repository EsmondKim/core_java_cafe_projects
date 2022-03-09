package cafeprojects;

import java.util.ArrayList;

//Fields
public abstract class Product {
protected String name = "Product";
protected Double price;
protected String description = "A tasty treat!";
protected Double quantity;
protected static Double shoppingCartSubtotal = 0.0;
protected static Double shoppingCartSalestaxPercentage = 0.08;
protected static Double shoppingCartSalestaxTotal;
protected static Double shoppingCartTotal;

//Constructor
    public Product() {
        System.out.println("No arg constructor was called.");
    }//no arg Constructor

    public Product(String name, Double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }//Product constructor with params

//Nested class: shoppingCart
    public static ArrayList<Object> ShoppingCart = new ArrayList<Object>();

//Methods
    public abstract void addOptions();

    public abstract void printOptions(boolean option1, boolean option2);

    public abstract void addToShoppingCartSubtotal();

    public static void calculateShoppingCartSalesTax() {
        shoppingCartSalestaxTotal = shoppingCartSubtotal * shoppingCartSalestaxPercentage;
    }//calculateShoppingCartSalesTax()

    public static void calculateShoppingCartTotal() {
        shoppingCartTotal = shoppingCartSubtotal + shoppingCartSalestaxTotal;

    }


//Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }//Getters and Setters

}//Product class
