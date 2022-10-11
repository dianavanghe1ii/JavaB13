package loops;

import java.util.Scanner;

public class WhileLoop5 {
    public static void main(String[] args) {
        /*
        ask user to give an integer number
        create multiplication table for that number up to 10s
        input data>5
        5*1 = 5
        5*2 =10
        ...
        5*10 =50
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer number");
        int number = scanner.nextInt();
        int number2 =1;
        while (number2<=10){
            System.out.println(number + " * " + number2 + " = " +number*number2);
            number2++;
        }
    }
}
