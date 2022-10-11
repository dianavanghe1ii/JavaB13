package string;

import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {
        String day = "Saturday";

        System.out.println(Arrays.toString(day.split("a")));

        //just as in the upcoming example:
        String[] x = {"A", "B", "C"};
        System.out.println(Arrays.toString(x));
        String[] strArray = day.split("a"); //[S, turd, y]
        System.out.println(Arrays.toString(strArray));
        System.out.println(day.toUpperCase());
        //create a for-each loop to print elements from strArray
        for (String str : strArray) {
            System.out.println(str);

        }
        String apple = "apple is a  raed";
        String[] applePart = apple.split("a");
        System.out.println(Arrays.toString(applePart));
        //print every element from applePart array as upperCase
        for (String part : applePart) {
            System.out.println(part.toUpperCase());
        }
    }
}
