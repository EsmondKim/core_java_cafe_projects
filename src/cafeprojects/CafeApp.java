package cafeprojects;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CafeApp {
    public static void main(String[] args) {
        boolean doWhileFlag =true;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

      do {
            System.out.println("Please select from the following menu:");
            System.out.println("Type \"1\" for Coffee.");
            System.out.println("Type \"2\" for Cappuccino.");
            System.out.println("Type \"3\" for Espresso.");
            System.out.println("Type \"4\" to Check Out.");
            Double item = sc.nextDouble();

            if (item == 1) {
                Coffee coffee = new Coffee("coffee", 2.75, "Hot coffee.");
                Product.ShoppingCart.add("Item: Coffee");
                Product.ShoppingCart.add("Price: " + coffee.price);
                Product.ShoppingCart.add("Quantity: " + Math.round(coffee.quantity));
                System.out.printf("You ordered: %s\n", coffee.getName());
                System.out.printf("Product Description: %s\n", coffee.getDescription());
                System.out.println("How many coffees would you like? (Enter a numeric digit.)");
                Double quantity = sc.nextDouble();
                coffee.setQuantity(quantity);
                coffee.addOptions();
                coffee.printOptions(coffee.sugar, coffee.milk);
                coffee.calculateCoffeeSubtotal();
                coffee.addToShoppingCartSubtotal();
            }//else if item ==1

            else if (item == 2) {
                System.out.println("2");
            }//else if item ==2

            else if (item == 3) {
                System.out.println("3");
            }//else if item ==3

            else {
                System.out.println("4");
                Product.ShoppingCart.add("Shopping Cart Subtotal: " + df.format(Product.shoppingCartSubtotal));
                Product.calculateShoppingCartSalesTax();
                Product.ShoppingCart.add("Shopping Cart Salestax: " + df.format(Product.shoppingCartSalestaxTotal));
                Product.calculateShoppingCartTotal();
                Product.ShoppingCart.add("Total Sale: " + df.format(Product.shoppingCartTotal));
                doWhileFlag = false;
            }//else for item 4
        }//do
      while (doWhileFlag);

        for (Object dataEntry : Product.ShoppingCart) {
            System.out.println(dataEntry);
        }//enhanced for loop
        Product.ShoppingCart.clear();
    }//main
}//CafeApp class


//
//        Coffee coffee = new Coffee("coffee", 2.75, "Hot coffee.");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("How many coffees do you want?");
//        Double quantityCoffee = sc.nextDouble();
//        coffee.setQuantity(quantityCoffee);
//        System.out.println("Do you want sugar in your coffee?");
//        boolean sugar = sc.nextBoolean();
//        coffee.setSugar(sugar);
//        System.out.println("Do you want milk in your coffee?");
//        boolean milk = sc.nextBoolean();
//        coffee.setMilk(milk);
//        System.out.printf("You ordered: %s\n", coffee.getName());
//        System.out.printf("Product Description: %s\n", coffee.getDescription());
//        if(sugar) {System.out.println("You ordered sugar with your coffee.");}
//        if(milk) {System.out.println("You ordered milk with your coffee.");}
//        System.out.printf("Your subtotal is: %.2f\n", coffee.calculateSubtotal());
//        System.out.printf("Your salestax is: %.2f\n", coffee.calculateSalestax());
//        System.out.printf("Your order total is: %.2f", coffee.calculateProductTotal());
//
//        System.out.println();
//
//        Espresso espresso = new Espresso("espresso", 3.50, "POWerful espresso.");
//        System.out.println("How many espressos do you want?");
//        Double quantityEspresso = sc.nextDouble();
//        espresso.setQuantity(quantityEspresso);
//        System.out.println("Do you want an extra espresso shot?");
//        boolean extra = sc.nextBoolean();
//        espresso.setExtraShot(extra);
//        System.out.println("Do you want a macchiato style espresso?");
//        boolean macchiato = sc.nextBoolean();
//        espresso.setMacchiato(macchiato);
//        System.out.printf("You ordered: %s\n", espresso.getName());
//        System.out.printf("Product Description: %s\n", espresso.getDescription());
//        if(extra) {System.out.println("You ordered an extra espresso shot.");}
//        if(macchiato) {System.out.println("You ordered your espresso shot macchiato style.");}
//        System.out.printf("Your subtotal is: %.2f\n", espresso.calculateSubtotal());
//        System.out.printf("Your salestax is: %.2f\n", espresso.calculateSalestax());
//        System.out.printf("Your order total is: %.2f", espresso.calculateProductTotal());
//
//        System.out.println();
//
//        Cappuccino cappuccino = new Cappuccino("cappuccino", 4.25, "Frothy milk foam tops off your joe.");
//        System.out.printf("How many cappuccinos do you want?");
//        Double quantityCappuccino = sc.nextDouble();
//        cappuccino.setQuantity(quantityCappuccino);
//        System.out.println("Do you want peppermint in your cappuccino?");
//        boolean peppermint = sc.nextBoolean();
//        cappuccino.setPeppermint(peppermint);
//        System.out.println("Do you want whipped cream on your cappuccino?");
//        boolean whippedCream = sc.nextBoolean();
//        cappuccino.setWhippedCream(whippedCream);
//        System.out.printf("You ordered: %s\n", cappuccino.getName());
//        System.out.printf("Product Description: %s\n", cappuccino.getDescription());
//        if(peppermint) {System.out.println("You ordered peppermint in your cappuccino.");}
//        if(whippedCream) {System.out.println("You ordered whipped cream on your cappuccino.");}
//        System.out.printf("Your subtotal is: %.2f\n", cappuccino.calculateSubtotal());
//        System.out.printf("Your salestax is: %.2f\n", cappuccino.calculateSalestax());
//        System.out.printf("Your order total is: %.2f", cappuccino.calculateProductTotal());
