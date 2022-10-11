package Project5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter one number between 1 to 10");
        int number = sc.nextInt();

        for ( ; number>=0 ; number--) {
            for (int j = 1; j <= number; j++) {
                System.out.print(number);

            }
            System.out.println();

        }
    }
}
