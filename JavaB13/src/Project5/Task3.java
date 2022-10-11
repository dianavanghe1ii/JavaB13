package Project5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter a number");
            int number= sc.nextInt();
                boolean flag = false;
                for (int i = 2; i <= number / 2; ++i) {
                    // condition for nonprime number
                    if (number % i == 0) {
                        flag = true;
                        break;
                    }
                }

                if (!flag)
                    System.out.println(number + " is a prime number.");
                else
                    System.out.println(number + " is not a prime number.");
            }
        }


