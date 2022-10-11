package homeworkExperiences;
import java.util.Scanner;
public class AbleToVote {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String fullName = s.nextLine();
        String stateCode = s.next();
        String city = s.next();
        String gender = s.next();
        int age = s.nextInt();
        // Please don't change anything on lines above.
//        fullName = fullName.toUpperCase();
//        stateCode = stateCode.toUpperCase();
//        city = city.toUpperCase();
//        gender = gender.toUpperCase();
//        char indexFullF = fullName.charAt(0);
//        char indexFullL = fullName.charAt(fullName.length() - 1);
//        char indexStateF = stateCode.charAt(0);
//        char indexStateL = stateCode.charAt(fullName.length() - 1);



//        if (indexFullF== 'A' && indexFullL=='V' && indexStateF=='I'
//                && indexStateL=='L'&& city.length()<10 && gender.equals('F') && age>18){
//            System.out.println("true");
//        } else{
//            System.out.println("false");
//        }



//        if (fullName.startsWith("A") && fullName.endsWith("V") && stateCode.startsWith("I")
//                && stateCode.endsWith("L") && city.length() <= 10 && gender == "F" && age >= 18) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
        }
    }


//1 In the main class, using scanner we asked all the information below to user.
// a. Full Name b. State Code c. City d. Gender ( F, M) e. Age
//If Age is more than 18 and Full Name is starting with ‘A’ and last name is ending with ‘V’
// and state code is starting with ‘I’ and state code is ending with ‘L’ and
// City length is less than 10, and gender is equal to ‘F’, I am able to vote.
// If I am able to vote, print true. If not, print false.
