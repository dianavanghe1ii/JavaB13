package loops;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        palindrome --> 1234321, EFE ANA ANNA
        get a string from user and check if that string is a palindrome or not
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a string");
        String str = sc.nextLine();
        //original entry ANNA after reversed --> ANNA --> original reversed
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        if (str.equalsIgnoreCase(reversed)){
            System.out.println(str + " is Palindrome");
        }else {
            System.out.println(str + " is not Palindrome");
        }
    }
}
