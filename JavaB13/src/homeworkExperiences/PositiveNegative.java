package homeworkExperiences;
import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int number = scan.nextInt();
        // Please don't change anything on lines above
        if(number<0){
            System.out.println("negative");
        }else if (number >0){
            System.out.println("positive");

        }


    }
}
//Using scanner user provided an integer number.Please write a code that prints whether it is positive or negative.
//
//Example Input number: 35 Output: positive Input number: -3 Output: negative
