package string;

import java.util.Scanner;

public class MethodsTask2 {
    public static void main(String[] args) {
        /*
    Get information from user in the following format: M - David White - 1999
    -check if the input string starts is starting with F
    -check if the input string is ending with M;
    -check if the input string equals to your name
    -check if the input is ending with ear 2000;
     */
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your gender, full name and birth year in following format: M - David White - 1999");
        String data = userInput.nextLine();
        System.out.println(data.startsWith("F"));
        System.out.println(data.endsWith("M"));
        System.out.println(data.equals("Diana"));
        System.out.println(data.endsWith("2000"));

        // replace the birth year with *(stars)
        data.replace("1999", " ****");
        System.out.println(data);
        String part = data.substring(data.length()-4);
        System.out.println(data.replace(part, "****"));




    }

}
