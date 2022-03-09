//package cafeprojects;
//
//import java.util.Scanner;
//
//public class Cappuccino extends Product {
//    boolean peppermint = true;
//    boolean whippedCream = true;
//    public Double quantity = 0.0;
//    public Double subtotal = 0.0;
//    public Double salestax = 0.0;
//    public Double total = 0.0;
//
//    public Cappuccino(String name, Double price, String description) {
//        super(name, price, description);
//        this.peppermint = false;
//        this.whippedCream = false;
//    }//Cappuccino extends Product
//
//    //Methods
//
//    @Override
//    public void addOptions() {
//        //placeholder
//    }
//
//    @Override
//    public void printOptions(boolean peppermint, boolean whippedCream) {
//        //placeholder
//    }
//
//    public Double calculateSubtotal() {
//        if  (peppermint && whippedCream)
//            this.subtotal = (quantity * price) + (3.00 * quantity);
//        else if (peppermint)
//            this.subtotal = (quantity * price) + (2.00 * quantity);
//        else if (whippedCream)
//            this.subtotal = (quantity * price) + (1.00 * quantity);
//        else
//            this.subtotal = price * quantity;
//        return subtotal;
//    }
//
//    public Double calculateSalestax() {
//        this.salestax = subtotal * 0.08;
//        return salestax;
//    }
//
//    @Override
//    public Double calculateProductTotal() {
//        return total = subtotal + salestax;
//    }//calculateProductTotal
//
//    //Getters and Setters
//    public boolean getPeppermint() {
//        return peppermint;
//    }
//
//    public void setPeppermint(boolean peppermint) {
//        this.peppermint = peppermint;
//    }
//
//    public boolean getWhippedCream() {
//        return whippedCream;
//    }
//
//    public void setWhippedCream(boolean whippedCream) {
//        this.whippedCream = whippedCream;
//    }
//
//    public Double getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(Double quantity) {
//        this.quantity = quantity;
//    }//Getters and Setters
//
//}//Cappuccino class