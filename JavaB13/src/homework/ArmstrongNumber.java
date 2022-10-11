package homework;
import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        // Find out if the number above is an Armstrong number.
        int sum =0;
        int copyOfNumber = number;
        for ( ; number>0;number=number/10){
            int digit= number%10;
            int cube=digit*digit*digit;
            sum+=cube;
        }
        if (sum==copyOfNumber){
            System.out.println(copyOfNumber + " is an Armstrong number");

        }else {
            System.out.println(copyOfNumber + " is not an Armstrong number");
        }
    }
}
