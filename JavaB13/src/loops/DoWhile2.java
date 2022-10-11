package loops;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        /* ask user to give two positive integer numbers
        -find the sum of numbers in the range
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first positive integer numbers");
        int number1 = scanner.nextInt();
        System.out.println("Enter your second positive integer number which should be more than the first entry");
        int number2 = scanner.nextInt();
        int sum = 0;
        do {
            sum = sum + number1;// sum+=number1;
            System.out.println("The sum of first numbers between " + number1+" and "+number2 + " is " +sum);
            number1++;
        } while (number1 <=number2);
        System.out.println(sum);

    }


}

