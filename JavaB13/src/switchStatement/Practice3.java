package switchStatement;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        /*
        Ask user for their favorite fruit
        -strawberry, apple, kiwi, dragon fruit, banana, pineapple, mango
        if youhave in the store
        --> we have .. fruit.. in the store in the store
        if you do not have the fruit in the store
        --> we do not have .. fruit.. in the store
        */
        Scanner input = new Scanner(System.in);
        System.out.println("What is your favorite fruit?");
        String favorite = input.nextLine().toLowerCase().trim();
        switch (favorite){
            case "strawberry" :
                System.out.println("We have " + favorite + " in the store");
                break;
            case "apple" :
                System.out.println("We have " + favorite + " in the store");
                break;
            case "kiwi" :
                System.out.println("We have " + favorite + " in the store");
                break;
            case "dragon fruit" :
                System.out.println("We have " + favorite + " in the store");
                break;
            case "banana" :
                System.out.println("We have " + favorite + " in the store");
                break;
            case "pineapple" :
                System.out.println("We have " + favorite + " in the store");
                break;
            case "mango" :
                System.out.println("We have " + favorite + " in the store");
                break;
            default:
                System.out.println("We do not have " + favorite + " in the store");
                break;
        }

    }
}
