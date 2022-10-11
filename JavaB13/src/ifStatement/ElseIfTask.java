package ifStatement;

import java.util.Scanner;

public class ElseIfTask {
    public static void main(String[] args) {
        /*
        ask user to give an integer number
        if number is greater than 0 --> print "your number is positive number"
        if number is less than 0 --> print "your number is negative number"
        otherwise --> "Your number is Zero"
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int number = input.nextInt();
        if(number>0){
            System.out.println("your number is positive number");
        } else if(number<0){
            System.out.println("your number is negative number");
        } else {
            System.out.println("your number is Zero");
        }
    }
}
