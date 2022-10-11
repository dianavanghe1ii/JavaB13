package homework;
import java.util.*;
public class WithoutZ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string value");
        String str = s.next();

        // Please don't change anything on lines above.
        String firstLeters = str.substring(0,2);
        String leftLetters= str.substring(2);
        firstLeters=firstLeters.replace("z","");
        System.out.println(firstLeters+leftLetters);
    }
}
