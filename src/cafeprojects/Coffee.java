package cafeprojects;

public class Coffee extends Product {
    public boolean sugar = true;
    public boolean milk = true;
    public Double quantity = 0.0;
    public Double subtotal = 0.0;
    public Double salestax = 0.0;

    public Coffee(String name, Double price, String description) {
        super(name, price, description);
        this.sugar = false;
        this.milk = false;
    }//Coffee extends Product

    public Double calculateSubtotal() {
        Double subtotal = price * quantity;
        this.subtotal = subtotal;
        return subtotal;
    }

    public Double calculateSalestax() {
        Double salestax = subtotal * 0.08;
        this.salestax = salestax;
        return salestax;
    }

    @Override
    public Double calculateProductTotal() {
        Double total = subtotal + salestax;
        return total;
    }//calculateProductTotal

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
