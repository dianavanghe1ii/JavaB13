package ifStatement;

import java.util.Scanner;

public class IfPractice2 {
    public static void main(String[] args) {
        /*
        get a number between 1 and 7 from user if the number is :
        1--> "It is Monday"
        2--> "It is Tuesday"
        ...
        ...
        7--> "It is Sunday"
         */
        Scanner input = new Scanner((System.in));

        System.out.println("Enter a number between 1 and 7");
        int  userNumber = input.nextInt();
        if (userNumber==1){
            System.out.println("It is Monday");

        }
        if (userNumber==2){
            System.out.println("It is Tuesday");
        }
        if (userNumber==3) {
            System.out.println("It is Wednesday");
        }
        if (userNumber==4) {
            System.out.println("It is Thursday");
        }
        if (userNumber==5) {
            System.out.println("It is Friday");
        }
        if (userNumber==6) {
            System.out.println("It is Saturday");
        }
        if (userNumber==7) {
            System.out.println("It is Sunday");
        }
        // "There is no day for that entry ...> 21"
        if (userNumber <1|| userNumber>7){
            System.out.println("There is no day for that entry >> " + userNumber);
        }



    }
}
