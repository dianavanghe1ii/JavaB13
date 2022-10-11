package Project5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a min and max integer number");
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        int sum = 0;
        for ( int divisor =min; divisor<max; divisor++){
            if (divisor%2==0 && divisor%7==0){
                sum=sum+divisor;
                System.out.println(divisor);
                }
        }
        System.out.println(sum);
    }
}
