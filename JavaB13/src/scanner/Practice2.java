package scanner;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        /*
        calculate BMI --> Body Mass Index >> 18 -24<< FIT
        BMI = weight / (height*height)
        kg/lbs      meter/inches
        By using scanner ask user to provide his/her weight and height
        -calculate his/her BMI and print it out

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your weight in kg");
        double weight = input.nextDouble();
        System.out.println("Please enter your height in meters");
        double height =input.nextDouble();
        double BMI = weight/ (height*height);
        System.out.println("Your BMI is " + BMI);

   }
}
