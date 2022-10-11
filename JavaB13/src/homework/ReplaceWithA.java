package homework;
import java.util.Scanner;
public class ReplaceWithA {
    public static void main(String[] args) {
        System.out.println("Enter a string value");
        Scanner s = new Scanner(System.in);
        String str = s.next();

        String a = "a";
        for(int i=1;i<=str.length();i++) {
            System.out.println(a+str.substring(i));
            a += "a";

        }


        }

    }
