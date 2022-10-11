package homeworkExperiences;
import  java.util.Scanner;
public class ValidPasswordTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please create a new and valid password.");
        String password = scanner.nextLine();
        String a=password.toUpperCase();
        String b= password.toLowerCase();
        System.out.println((!password.equals(a)
                && (!password.equals(b))));






        }
        // Please don't change anything on lines above.
        // Please find out whether or not the password is valid.
}

//The value of the password has already been assigned using scanner.
//
//We asked the user to create a new and valid password. The valid password must contain at least one upper case
// and at least one lower case letter. Print true when the password is valid, if not print false.
//
//Example:
//
//Input: password Output: false
//
//Input: Password Output: true
