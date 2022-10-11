package switchStatement;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        /*
        ask user to provide a number between 1 and 5
        print the name of the day for user's entry
        1--> Monday
        2-->Tuesday
        .. Friday
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 5");
        int dayNumber = input.nextInt();
        switch (dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("There is no matching day for your entry");
                break;
        }
        System.out.println("it was good to have a guessing game");
    }
}
