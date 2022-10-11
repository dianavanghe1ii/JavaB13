package homeworkExperiences;
import java.util.Scanner;
public class StartingWithFirstWordTask {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter first string value");
    String firstString = scanner.next();
    System.out.println("Enter second string value");
    String secondString = scanner.next();
    firstString = firstString.toUpperCase();
    secondString= secondString.toUpperCase();

    System.out.println(secondString.startsWith(firstString.substring(firstString.length()-2)));




    // Please find out if the secondString starts with last two characters of the firstString
    // Please do not change anything on lines above.




    }

}
//The value of the first string and the second string have already been assigned by using scanner.
// If the second string starts with the first string’s last two characters, print true.
// If not, print false.
// Example 1: Enter first string value: Google Enter second string value:: Learning Result: true
// Example 2: Enter first string value: Utility Enter Second string value: Type Result: true
