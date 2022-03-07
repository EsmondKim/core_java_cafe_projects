package cafeprojects;

import java.util.Scanner;

public class CafeApp {
    public static void main(String[] args) {
        Product coffee = new Product("coffee", 2.75, "Hot coffee.");
        Scanner inputCoffee = new Scanner(System.in);
        System.out.println("How many coffees do you want?");
        Double quantityCoffee = inputCoffee.nextDouble();
        coffee.setQuantity(quantityCoffee);
        System.out.printf("You ordered: %s\n", coffee.getName());
        System.out.printf("Product Description: %s\n", coffee.getDescription());
        System.out.printf("Your order total is: %.2f", coffee.calculateProductTotal());

        System.out.println();

        Product espresso = new Product("espresso", 3.50, "POWerful espresso.");
        Scanner inputEspresso = new Scanner(System.in);
        System.out.println("How many espressos do you want?");
        Double quantityEspresso = inputEspresso.nextDouble();
        espresso.setQuantity(quantityEspresso);
        System.out.printf("You ordered: %s\n", espresso.getName());
        System.out.printf("Product Description: %s\n", espresso.getDescription());
        System.out.printf("Your order total is: %.2f", espresso.calculateProductTotal());

        System.out.println();

        Product  cappuccino = new Product("cappuccino", 4.25, "Frothy milk foam tops off your joe.");
        Scanner inputCappuccino = new Scanner(System.in);
        System.out.printf("How many cappuccinos do you want?");
        Double quantity = inputCappuccino.nextDouble();
        cappuccino.setQuantity(quantity);
        System.out.printf("You ordered: %s\n", cappuccino.getName());
        System.out.printf("Product Description: %s\n", cappuccino.getDescription());
        System.out.printf("Your order total is: %.2f", cappuccino.calculateProductTotal());
    } //main


}//CafeApp
