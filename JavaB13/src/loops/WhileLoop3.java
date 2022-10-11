package loops;

import java.util.Scanner;

public class WhileLoop3 {
    public static void main(String[] args) {
        /*
        ask user to enter an integer number and find teh divisor of given number
        --> print out divisor" ..1.. can divide ...givenNumber... evenly"
        10 --> 1, 2, 5, 10
        15 -- > 1, 3, 5, 15
        12 --> 1, 2, 3, 4, 6, 12
        %, loop, scanner, if, -else-, condition
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer number");
        int number = scanner.nextInt();
        int divisor = 1;

        while (divisor<=number){
            if (number% divisor==0) {
                System.out.println(divisor + " can divide " + number + " evenly");
            } else {
                System.out.println(divisor);

            }
            divisor++;
        }
    }
}
