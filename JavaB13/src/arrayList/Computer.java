package arrayList;

public class Computer {
    /*
    1. Create a computer class with the following instance fields
    brand, model, screenSize, price
    2. override--> toString method to show Computer features
    3. Create  a test Class;
    create an arrayList and store 4 computers
    4. Create a method in this test class to find out computer with price of less than $500 and show tha computer
    Ex:
    apple, macPro, 15, 2200;
    HP, Envy, 16, 1600;
    Dell, Inspiron, 14, 500;
    Lenovo,
    */
    String brand, model;
    int screenSize;
    double price;

    @Override
    public String toString() {
        return "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", price=" + price +
                '}';
    }

    public Computer(String brand, String model, int screenSize, double price) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.price = price;
    }
}
