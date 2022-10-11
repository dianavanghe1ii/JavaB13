package arrayList;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
    // got to do it outside the main

    public static void blueCars(List<Car> cars){
        for (Car myCar: cars){
            if (myCar.color.equalsIgnoreCase("blue")){
                System.out.println(myCar.brand+" - "+ myCar.model+" is a blue car");
            }
        }
    }

    public static void redCars(List<Car> cars){
        for (Car myCar: cars){
            if (myCar.color.equalsIgnoreCase("red")){
                System.out.println(myCar.brand+" - "+ myCar.model+" is a red car");
            }
        }

    }

// just an example
    public static void exampleExercise(ArrayList example){ //Object not specified
        for (Object o: example){
            System.out.println(o);
        }
    }

    public static void main(String[] args) {


        System.out.println("==========================");
        ArrayList states = new ArrayList<>();

        states.add("IL");
        states.add("WI");
        states.add("MI");

        exampleExercise(states);
        System.out.println("=============================");





        Car car1= new Car("Lexus", "SUV", "Blue", 2022);
        Car car2= new Car("Mercedes", "Classic", "Red", 2023);
        Car car3= new Car("Honda", "CRV", "Blue", 2016);

        List<Car> inventory= new ArrayList<>();

        inventory.add(car1);
        inventory.add(car2);
        inventory.add(car3);
        blueCars(inventory);
        redCars(inventory);

        // not passing object type to store in the arrayList
        ArrayList list = new ArrayList();// you can also add < String > after first ArrayList int this line
        list.add("Dima");
        list.add(car1);
        Integer[] numbers= {1, 2, 3};
        list.add(numbers);
        System.out.println(list);

    }
}
