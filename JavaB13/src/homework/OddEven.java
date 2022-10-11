package homework;
import  java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string value.");
        String string = sc.nextLine();
        // Please do not change anything on lines above.
        string = string.trim().replace(" ", "");

        int length = string.length();

        if(length%2 == 0) {
                System.out.println("false");
            } else {
            System.out.println("true");
        }

    }

}
