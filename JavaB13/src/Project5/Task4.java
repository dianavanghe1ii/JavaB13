package Project5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter one number between 1 to 10");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);

            }
            System.out.println();

        }
    }
}
