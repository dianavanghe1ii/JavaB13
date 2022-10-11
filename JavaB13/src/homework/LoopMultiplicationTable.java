package homework;
import java.util.*;
public class LoopMultiplicationTable {
    public static void main(String[] args) {

        System.out.println("Please enter an integer number");
        int num = new Scanner(System.in).nextInt();

        // Please don't change anything on the lines above.
        // Print the multiplication table for num variable.

        //5 * 1 = 5

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (i * num));
        }
    }
}
