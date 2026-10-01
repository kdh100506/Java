package _06F_encapsulation;

public class Customer {
    private String name;
    private String model;
    private double price;

    public Customer(String name, String model, double price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}
