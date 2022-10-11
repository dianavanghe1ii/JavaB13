package homework;
import java.util.*;
public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number 1");
        int number1 = s.nextInt();
        System.out.println("Enter the number 2");
        int number2 = s.nextInt();
        // number1 and number2 are given above. Please find LCM for these two numbers.
        int i=0;
        int highestDivisor=0;
        int leastMultiple=0;
        for(i = 1; i <= number1 || i <= number2; i++) {
            if( number1 % i == 0 && number2 % i == 0)
                highestDivisor = i;
                leastMultiple=i;
        }
        System.out.println((number1*number2)/highestDivisor);
    }
}
