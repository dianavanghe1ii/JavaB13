package ifStatement;

import java.util.Scanner;

public class ElseTask3 {
    public static void main(String[] args) {
        /*
        ask user to enter their zipcode as integer
        check if user's zipcode is an even number
        -print >> you are living in an Even number zipcode --> 0,2,4,6,8,256
        -> otherwise print --> you are living in an Odd number zipcode
        */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your zipcode as integer");
        int zipcode = scanner.nextInt();
        if(zipcode%2 == 0){
            System.out.println("you are living in an Even number zipcode " + zipcode);
        } else {
            System.out.println("you are living in an Odd number zipcode " + zipcode);

        }

    }
}
