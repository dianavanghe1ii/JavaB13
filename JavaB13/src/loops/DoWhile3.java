package loops;

import java.util.Scanner;

public class DoWhile3 {
    public static void main(String[] args) {
        /*ask user to give a positive integer number and
        create a start for that given number
        input number : 5
        output:
        *
        **
        ***
        ****
        *****
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first positive integer numbers");
        int number = scanner.nextInt();
        String star = "*";
        do {

            System.out.println(star + "*");
            star +="*";
            number--;

        }while (number>0);
        System.out.println(star);

    }
}
