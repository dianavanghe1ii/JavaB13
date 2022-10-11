package ifStatement;

public class CurlyBraketPractice {
    public static void main(String[] args) {
        int number = 123;
        //without curly brackets, if statement will execute all the following codes
        if (number == 123)
            System.out.println("first statement");
        System.out.println("second statement");
        System.out.println("===================");

        // without curly brackets, if statement will skip first piece of code when boolean condition is False
        if (number > 500) {
            System.out.println("hi, this is first statement");
            System.out.println("Hello, this is second statement");
            System.out.println("I am learning If block");
            if (8 != 8) {
                System.out.println("8 should be equals to 8");
                System.out.println("###########");
            }
        }
    }
}
