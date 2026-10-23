package Part_4;

public class Pizza {
    // 4.1. Fields
    private int price;
    private String name;

    // Constructor
    public Pizza(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 4.1. Getters and setters
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // 4.1. Method that generates the pizza information as a string
    public String getInfo() {
        return "Pizza: " + name + ", Price: " + price;
    }
}