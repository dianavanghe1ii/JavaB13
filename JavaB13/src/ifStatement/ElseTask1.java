package ifStatement;

import java.util.Scanner;

public class ElseTask1 {
    public static void main(String[] args) {
        /*
        as user if s/he has drier licence
        -print you are great
        -otherwise print --> Please visit closest DMV location         */
        Scanner input = new Scanner(System.in);
        System.out.println("do you have driver licence yes/no?");
        String data = input.nextLine();
        if (data.equalsIgnoreCase("yes")){
            System.out.println("you are great");
        } else{
            System.out.println("please visit closes DMV location");
        }

    }

}
