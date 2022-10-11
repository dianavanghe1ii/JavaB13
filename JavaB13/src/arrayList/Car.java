package arrayList;

public class Car {
    /*
    Create a Car class with instance variables of:
    brand, model, color, year
    initialize all instance variables
    int a testclass :
    store 3 car objects in a list
    create a method to find out blue cars and print those cars' brand and model
     */
    String brand, model, color;
    int year;

    public Car(String brand, String model, String color, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car";
    }
}
