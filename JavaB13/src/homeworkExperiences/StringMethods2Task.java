package homeworkExperiences;
import java.util.Scanner;
public class StringMethods2Task {
    public static void main(String[] args) {
// Please do all coding here
        Scanner user =new Scanner(System.in);
        System.out.println("Enter a random word");
        String randomWord = user.nextLine();// -> User enters a random word.

        System.out.println("Enter number of letter that word consists of");
        int numberOfLetters = user.nextInt();  // -> User tries to enter number of letters that word consists of.

        System.out.println("Enter a letter that you want to learn its index");
        String enteredLetter = user.next(); // -> User enters a letter to learn its index.
        System.out.println((numberOfLetters == randomWord.length()));
        System.out.println(randomWord.indexOf(enteredLetter));

        // Please don't change anything on lines above.



    }
}
//Go to the Main class.
//We have already created a scanner object inside the main method.
//We asked the user to enter a random word.
//Then we asked the user to input the number of letters that word consists of.
//Lastly we asked user for a letter that they want to learn its index.
//Your code should print true if the user entered a right number of letters in the word.Print false if the wrong number is entered.
//Your code should print the index of the entered letter, if the word doesn’t contain the letter then the code should print -1.
//Please look at two example outputs below to understand how your code should work. Please follow the order when you are printing.
//EXAMPLE OUTPUT: Enter a random word
//Techtorial -> this line represents user's input Enter number of letter that word consists 10 -> this line represents user's input true Enter a letter that you want to find an index a -> this line represents user's input 8
//
//SECOND EXAMPLE OUTPUT:
//
//Enter a random word Java Enter number of letter that word consists 6 false Enter a letter that you want to find an index v 2
