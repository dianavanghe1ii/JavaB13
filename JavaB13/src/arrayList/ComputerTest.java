package arrayList;

import java.util.ArrayList;

public class ComputerTest {
    public static void main(String[] args) {
        Computer c1= new Computer("Apple", "Pro", 11, 1000);
        Computer c2= new Computer("HP", "Envy", 15, 1500);
        Computer c3= new Computer("Lenovo", "ThinkPad", 11, 450);
        Computer c4= new Computer("Apple", "Air", 16, 1200);

        ArrayList<Computer> devices= new ArrayList<>();
        devices.add(c1);
        devices.add(c2);
        devices.add(c3);
        devices.add(c4);
        System.out.println(devices);//
        // [Computer{brand='Apple', model='Pro', screenSize=11, price=1000.0},
        // Computer{brand='HP', model='Envy', screenSize=15, price=1500.0},
        // Computer{brand='Lenovo', model='ThinkPad', screenSize=11, price=450.0},
        // Computer{brand='Apple', model='Air', screenSize=16, price=1200.0}]
        priceChecker(devices);
        ArrayList< Double> devicePrices = findSum(devices);
        System.out.println(devicePrices);

    }
    public static void priceChecker(ArrayList<Computer> computers){
        for ( Computer machine : computers ){
            if (machine.price<500){
                System.out.println("Price of "+machine.brand+ " is less than $500");
            }
        }

    }
    //create a method that will take an ArrayList as parameter
    // this method will calculate total prices of the computers
    /*
    return device prices ina separate list
     */
     public static ArrayList<Double> findSum( ArrayList<Computer> computers ){
        double sum=0;
        ArrayList<Double> prices= new ArrayList<>();

        for ( Computer item:computers ){
            prices.add(item.price);
            sum= sum+item.price;
        }
         System.out.println("Total price of computers is " + sum);
        return prices;
     }
}
