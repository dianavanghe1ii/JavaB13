package homework;
import java.util.*;
public class SumOfSeries {
    public static void main(String[] args) {
        System.out.println("Enter the number of term");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // n is given above.
        int seriesNumbs =0;
        int sum =0;
        for ( ; n>0; n--){
            seriesNumbs=seriesNumbs*10+1;
            sum+=seriesNumbs;

        }
        System.out.println(sum);

    }

}
