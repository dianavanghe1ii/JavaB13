package Project5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String input= scanner.nextLine();
        String reversed="" ;
        for(int i=input.length()-1;i>=0; i--  ){
            reversed += input.charAt(i);



        }
        System.out.println( reversed.trim());
    }
}
