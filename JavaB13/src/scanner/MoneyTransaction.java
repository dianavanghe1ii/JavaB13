package scanner;

import java.util.Scanner;

public class MoneyTransaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 200; // check1 = 480, check2 = 600, check3 = 350, phone$ = 599, headphone$ = 299;

        System.out.println("Please enter first check amount");
        double check1 = scanner.nextDouble();
        balance += check1;


        System.out.println("Please enter second check amount");
        double check2 = scanner.nextDouble();
        balance = balance + check2; // or use balance += check2;

        System.out.println("Please enter third check amount");
        balance = balance + scanner.nextDouble();

        System.out.println("Please enter the phone price");
        double phone$ = scanner.nextDouble();
        balance = balance - phone$;

        System.out.println("Please enter the headphone price");
        balance = balance - scanner.nextDouble();

        System.out.println("This is your final balance " + balance)
        ;





        }
    }
