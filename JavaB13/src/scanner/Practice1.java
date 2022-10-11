package scanner;
import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {
        String text = new String();
        text = "Java";
        System.out.println(text);

        Scanner scanner = new Scanner(System.in);

        String myName= "Sam";
        System.out.println("Please enter your name ");
        myName = scanner.nextLine();

        System.out.println("Hello " + myName);
        System.out.println("Please enter your last name");
        String lastName = scanner.nextLine();
        System.out.println("Your full name is: " + myName + " " + lastName);

        System.out.println("Please enter your zip code as number ");

        int zipcode = scanner.nextInt();
        System.out.println("Hey " + myName + " you are living in this  " + zipcode + " zip code");
        scanner = new Scanner(System.in);

        //Task: get address of user and show it as  **** ... ****

        System.out.println("Enter your address");
        String address = scanner.nextLine();
        System.out.println("**** " + address + " ****");

        System.out.println("Enter your phone number ");
        long phoneNumber = scanner.nextLong();
        System.out.println("Is this number correct? " + phoneNumber);
        String yesNo = scanner.next();
        System.out.println("You said " + yesNo);




    }
}
