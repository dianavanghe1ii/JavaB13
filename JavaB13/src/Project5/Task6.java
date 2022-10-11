package Project5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter string");
        String input = scn.nextLine();
        String output = "";
        for (int a =0 ;a<=input.length()-1;a++){

            if (output.contains("" + input.charAt(a))&&!(input.charAt(a)==' ')){

                continue;

            }
            output+=input.charAt(a);
        }
        System.out.println(output);


        }
    }
