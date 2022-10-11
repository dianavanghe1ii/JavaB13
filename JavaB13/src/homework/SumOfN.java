package homework;
import java.util.*;
public class SumOfN {
    public static void main(String[] args) {
        System.out.println("Enter number of terms of series :");
        int n = new Scanner(System.in).nextInt();
        // Please don't change anything on lines above.
        double sum= 0;
        for (int i=1; i<=n; i++){
            sum+=1.0/i;
        }
        System.out.println(sum);
    }
}
