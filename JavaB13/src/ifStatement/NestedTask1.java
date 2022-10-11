package ifStatement;

import java.util.Scanner;

public class NestedTask1 {
    public static void main(String[] args) {
        /*
        ask user for their city name
        -if city name is "chicago"
        -ask user for their school/course name
        -if the course name is techtorial
        -->print "you are lucky"
        if the city name is not chicago
        -tell user to come and visit techtorial
        -if the school is not techtorial
        -tell user to come visit techtorial
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your city name");
        String city = scanner.nextLine();
        if (city.equalsIgnoreCase("Chicago")){
            // when the city name is chicago
            System.out.println("which school are you attending?");
            String school = scanner.nextLine();
            if(school.equalsIgnoreCase("Techtorial")){
                // when school name is techtorial
                System.out.println("you are lucky to be in B13");
            }else{
                // when school name is not techtorial
                System.out.println("Visit Techtorial since you are in Chicago");
            }


        } else {
            //when the city name is not chicago
            System.out.println("Come to chicago and visit Techtorial");
        }





    }
}
