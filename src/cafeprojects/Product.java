package cafeprojects;

//Fields
public class Product {
private String name = "Product";
private Double price = 1.00;
private String description = "A tasty treat!";
private Double quantity = 0.0;

//Constructor

    public Product() {
        System.out.println("No arg constructor was called.");
    }//no arg Constructor

    public Product(String name, Double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }//Product constructor with params

//Methods
    public Double calculateProductTotal() {
        Double subtotal = quantity * price;
        Double salesTax = subtotal * .08;
        Double total = subtotal + salesTax;
        return total;
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
