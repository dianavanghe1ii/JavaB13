package Project5;

import java.util.Locale;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Enter a sentence that is not separated by space and each word starts with upper case");
        Scanner sc= new Scanner(System.in);
        String sentence= sc.nextLine();
        String sentence2= " ";
        for (int a =0 ;a<=sentence.length()-1;a++){

            if (sentence.charAt(a)>='A'&&sentence.charAt(a)<='Z'){
                sentence=sentence.substring(0,a)+" "+sentence.substring(a);
                a++;
            }



        }
        System.out.println(sentence.trim());

        }
    }

