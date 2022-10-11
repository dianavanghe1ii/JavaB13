package ifStatement;

import java.util.Scanner;

public class IfPractice3 {
    public static void main(String[] args) {
        /*
        ask user to enter name of the day Monday - Sunday
        print "It is day 1"
        "It is day 2"
        ...
        ...
        *when user enter any other day than expected
        print "There is not matching day for your entry"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of the day from Monday to Sunday");

        String day = scanner.nextLine();
        if (day.equalsIgnoreCase("Monday")) {
            System.out.println("It is day 1");
        }
        if (day.equalsIgnoreCase("Tuesday")) {
            System.out.println("It is day 2");
        }
        if (day.equalsIgnoreCase("Wednesday")) {
            System.out.println("It is day 3");
        }
        if (day.equalsIgnoreCase("Thursday")) {
            System.out.println("It is day 4");
        }
        if (day.equalsIgnoreCase("Friday")) {
            System.out.println("It is day 5");
        }
        if (day.equalsIgnoreCase("Saturday")) {
            System.out.println("It is day 6");
        }
        if (day.equalsIgnoreCase("Saturday")) {
            System.out.println("It is day 7");
        }
        if (!day.equalsIgnoreCase("Monday") && !day.equalsIgnoreCase("Tuesday")
                && !day.equalsIgnoreCase("Wednesday") && !day.equalsIgnoreCase("Thursday")
                && !day.equalsIgnoreCase("Friday") && !day.equalsIgnoreCase("Saturday")
                && !day.equalsIgnoreCase("Sunday")) {

            System.out.println("There is not matching day for your entry >> " + day);
        }
        // if the first letter of the entered day is:
        // M or m --> It is Monday
        // T or t --> It is Tuesday
        // ... solve it by using char/string
        if (day.startsWith("M") || day.startsWith("m")) {
            System.out.println("It is Monday -----> using string  method >startsWith< solution");
            char firstLetter = day.charAt(0);
            if (firstLetter == 'M' || firstLetter == 'm') {
                System.out.println("It is Monday -----> using char solution");
            }
            if (firstLetter == 'T' || firstLetter == 'm') {
                System.out.println("It is Tuesday or Thursday -----> using char solution");
            }
            if (firstLetter == 'W' || firstLetter == 'w') {
                System.out.println("It is Wednesday -----> using char solution");
            }
            if (firstLetter == 'F' || firstLetter == 'f') {
                System.out.println("It is Friday -----> using char solution");
            }
            if (firstLetter == 'M' || firstLetter == 'm') {
                System.out.println("It is Saturday or Sunday -----> using char solution");

            }



        }
        }
    }










