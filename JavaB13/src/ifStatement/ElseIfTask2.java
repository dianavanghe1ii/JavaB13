package ifStatement;

import java.util.Scanner;

public class ElseIfTask2 {
    public static void main(String[] args) {
        /*
        -take 3 scores from user
        if average of 3 test scores of student is falling into following ranges
        score is 100-90 --> Your grade is A
        score is 89-80 -- > Your rade is B
        score is 79-70 --> Your grade is C
        score is 69-60 --> Your grade is D
        otherwise --> "we have space for next semester"
         */
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter first score");
        double first = input1.nextDouble();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter second score");
        double second = input2.nextDouble();
        Scanner input3 = new Scanner(System.in);
        System.out.println("Please enter third score");
        double third = input3.nextDouble();
        double averagescore = ((first+second+third)/3);
        if(averagescore<=100 && averagescore>=90){
            System.out.println("Your grade is A");
        } else if(averagescore<=89 && averagescore>=80){
            System.out.println("Your grade is B");
        } else if(averagescore<=79 && averagescore>=70) {
            System.out.println("Your grade is C");
        } else if(averagescore<=69 && averagescore>=60) {
            System.out.println("Your grade is D");
        }else if(averagescore>100 || averagescore <0) {
            System.out.println("Your average is out of range");
        } else{
            System.out.println("We have space for next semester");
        }
    }
}
