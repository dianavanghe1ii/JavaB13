package homeworkExperiences;
import java.util.Scanner;
public class GradeConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your grade in letter.");
        String grade = scan.nextLine();
        // Please don't change anything on lines above.
        double gradeA=4.0, gradeAMinus=3.7,gradeBPlus = 3.3, gradeB= 3.0, gradeBMinus = 2.7, gradeCPlus= 2.3,
        gradeC = 2.0,gradeCMinus= 1.7, gradeDPlus = 1.3, gradeD = 1.0, gradeF = 0.0;

        if(grade.equalsIgnoreCase("A")){
            System.out.println(gradeA);
        }else if(grade.equalsIgnoreCase("A-")){
            System.out.println(gradeAMinus);
        }else if(grade.equalsIgnoreCase("B+")){
            System.out.println(gradeBPlus);
        }else if(grade.equalsIgnoreCase("B")){
            System.out.println(gradeB);
        }else if(grade.equalsIgnoreCase("B-")){
            System.out.println(gradeBMinus);
        }else if(grade.equalsIgnoreCase("C+")){
            System.out.println(gradeCPlus);
        }else if(grade.equalsIgnoreCase("C")){
            System.out.println(gradeC);
        }else if(grade.equalsIgnoreCase("C-")){
            System.out.println(gradeCMinus);
        }else if(grade.equalsIgnoreCase("D+")){
            System.out.println(gradeDPlus);
        }else if(grade.equalsIgnoreCase("D")){
            System.out.println(gradeD);
        }else if(grade.equalsIgnoreCase("F")){
            System.out.println(gradeF);
        }else {
            System.out.println("The letter is not in the range");
        }
    }

}
//Using scanner user is asked to enter grade letters. The University uses a 4 point scale for grades;
// these “quality” grades are as follows
// 4.0 = A, 3.7 = A-, 3.3 = B+, 3.0 = B, 2.7 = B-, 2.3 = C+, 2.0 = C, 1.7 = C-,1.3 = D+, 1.0 = D, F = 0.0
// Print the number value matching with this grade letters that user provided.
// Example 1: Input : A Output: 4.0 Example 2: Input: A- Output: 3.7 NOTE:

