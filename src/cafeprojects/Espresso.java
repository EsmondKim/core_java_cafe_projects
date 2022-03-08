package cafeprojects;

public class Espresso extends Product {
    boolean extraShot = true;
    boolean macchiato = true;
    public Double quantity = 0.0;
    public Double subtotal = 0.0;
    public Double salestax = 0.0;
    public Double total = 0.0;

    public Espresso(String name, Double price, String description) {
        super(name, price, description);
        this.extraShot = false;
        this.macchiato = false;
    }//Espresso extends Product

   //Methods
    public Double calculateSubtotal() {
        if  (extraShot && macchiato)
            this.subtotal = (quantity * price) + (3.00 * quantity);
        else if (extraShot)
            this.subtotal = (quantity * price) + (2.00 * quantity);
        else if (macchiato)
            this.subtotal = (quantity * price) + (1.00 * quantity);
        else
            this.subtotal = price * quantity;
        return subtotal;
    }

    public Double calculateSalestax() {
        this.salestax = subtotal * 0.08;
        return salestax;
    }

    @Override
    public Double calculateProductTotal() {
           return  total = subtotal + salestax;
    }//calculateProductTotal

    //Getters and Setters
    public boolean getExtraShot() {
        return extraShot;
    }

    public void setExtraShot(boolean extraShot) {
        this.extraShot = extraShot;
    }

    public boolean getMacchiato() {
        return macchiato;
    }

    public void setMacchiato(boolean macchiato) {
        this.macchiato = macchiato;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }//Getters and Setters

}//Espresso class