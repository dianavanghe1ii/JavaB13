package loops;

import java.util.Scanner;

public class WhileLoop4 {
    public static void main(String[] args) {
        /*
        get two positive numbers form user
        and print out the number between these given numbers
        given numbers >>>> 1-9
              print >>>> 1, 2, 3, ... 9
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two positive integer numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1<=number2){
            while (number1<=number2){
                System.out.println(number1);
                number1++;
            }

        }else {
            while ( number2<=number1){
                System.out.println(number2);
                number2++;
            }
        }

    }

}

