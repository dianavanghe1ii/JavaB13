package arrayList;

import java.util.ArrayList;

public class Task1 {
    // create a method that will take ArrayList as a parameter
    // this method will show only drinks which has length of more than 3 letters
    // assume that you have list of drinks to test
    // create main method to test your code by calling the method
    // Coffee, Water, Tea
    public static void printDrink(ArrayList <String> list){// gotta make it static for lane 20
        for (int i =0; i<list.size(); i++){
            if (list.get(i).length()>3){
                System.out.println("This drink has more than 3 letters "+list.get(i));
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> drinks= new ArrayList<>();
        drinks.add("Coke");
        drinks.add("Milk");
        drinks.add("Juice");
        drinks.add("Tea");
        printDrink(drinks);
    }
}
