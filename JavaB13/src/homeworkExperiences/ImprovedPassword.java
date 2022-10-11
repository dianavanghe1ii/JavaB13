package homeworkExperiences;
import java.util.Scanner;
public class ImprovedPassword {
    public static void main(String[] args) {
        System.out.println("Enter a password");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        // Please don't change anything on lines above
        String upperC = password.toUpperCase();
        String lowerC = password.toLowerCase();
        int iOfLast = password.length() - 1;
        if (upperC.equals(password) || lowerC.equals(password)) {
            System.out.println("Your password is not acceptable");
        } else if (upperC.charAt(0) == password.charAt(0) && lowerC.charAt(0) != password.charAt(0) &&
                upperC.charAt(iOfLast) == lowerC.charAt(iOfLast)) {
            System.out.println("Your password is strong");
        } else if (lowerC.charAt(0) == password.charAt(0) && lowerC.charAt(0) == password.charAt(0) && upperC.charAt(0) != password.charAt(0) &&
                password.charAt(iOfLast) == upperC.charAt(iOfLast)) {
            System.out.println("Your password should be improved");
        } else {
            System.out.println("Your password is not valid");
        }

    }
}

//User is asked to enter a password in main class. We should write a program to check password by following steps
//
//1 - > If the string doesn't have any upper case letter or any lower case letter print "Your password is not acceptable"
//
//2 - > If the first character of the password is upper case letter and the last character of the password is not letter print "Your password is strong".
//
//3 - > If first character of the password is lower case letter and the last character of the string is upper case print "Your password should be improved"
//
//4 - > For all other conditions print "Your password is not valid"
//
//For this task you should use if else statement.
//
//This is the hardest task in this week's homework.
//
//Good Luck !
