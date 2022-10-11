package homeworkExperiences;
import java.util.Scanner;
public class PeopleCatsAndDogs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number of cats");
        int numberOfCats = s.nextInt();
        System.out.println("Please enter the number of people");
        int numberOfPeople = s.nextInt();
        if(numberOfCats>numberOfPeople){
            System.out.println("Too many cats! The world is meowed!");
        }else if(numberOfCats<numberOfPeople){
            System.out.println("Not many cats! The world is saved!");
        }else {
            System.out.println("Wow! There is a cat for every person.");
        }
    }
}
//In main class, two integer variables are created using scanner for cats, and people.
//
//If the number of cat is bigger than number of people print "Too many cats! The world is meowed!", if the number of cats are smaller than number of people print "Not many cats! The world is saved!". Lastly if they equal to each other print "Wow! There is a cat for every person."
//
//Note: Please use if else statement for this question.