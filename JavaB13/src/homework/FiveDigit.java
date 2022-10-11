package homework;

public class FiveDigit {
    public static void main(String[] args) {
        int number_1 = 45678;

        int temp = number_1;
        int digit1 = number_1 % 10;
        number_1 = number_1 / 10;
        int digit2 = number_1 % 10;
        number_1 = number_1 / 10;
        int digit3 = number_1 % 10;
        number_1 = number_1 / 10;
        int digit4 = number_1 % 10;
        number_1 = number_1 /10;
        int digit5 = number_1 % 10;
        System.out.println(digit5);
        System.out.println(digit4);
        System.out.println(digit3);
        System.out.println(digit2);
        System.out.println(digit1);



    }
}
