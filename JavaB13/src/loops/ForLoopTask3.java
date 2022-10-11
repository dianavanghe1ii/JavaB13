package loops;

import java.util.Scanner;

public class ForLoopTask3 {
    public static void main(String[] args) {
        /*
        perfect number --> 6 divisors of 6 : 1, 2, 3==> 1+2+3=6
        ask user to give positive integer number and check if the number is perfect number or not

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a integer number to if it is a Perfect number or not");
        int number = scanner.nextInt();
        int sum = 0;
        for ( int divisor =1; divisor<=number/2; divisor++){
            if (number%divisor==0){
                sum=sum+divisor;
                System.out.println(divisor); //showing divisors
            }
        }
        if (number==sum){
            System.out.println(number+ " is a perfect number");
        }else{
            System.out.println(number+ " is not a perfect number");
        }
    }
}
