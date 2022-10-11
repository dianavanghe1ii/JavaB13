package ifStatement;

public class CurlyBracketsPractice2 {
    public static void main(String[] args) {
        double money = 100;
        double itemPrice = 200;
        if (money < itemPrice)
            System.out.println("You can not buy this item");
        System.out.println("It i a sunny day");
        String color = "White";
        if (color.length() < 3)
            System.out.println("This color has less than 10 letters");
        //System.out.println("It is break time yet?");
        System.out.println("$$$$$$$$$$$$$");
        // decrement/Increment ++ --
        int a = 5, b = 3, x;
        a++; // affected even though not re-assigned so a=6 now because  a++ is a statement
        if (a < b + b) // false
            b++;// this statement will be skipped because of IF condition returns False
        x = a + ++b; // 6+4=10
        if (x > 20) // false because 10is not greater than 20
            System.out.println(x); //this statement will be skipped because of IF condition returns False
        --x; // this will work and --10=9
        System.out.println(x); //9
        // it will print x one/two times
        // x will be...


        System.out.println("=================");

        if (a < b + b) {
             // false
                b++;// this statement will be skipped because of IF condition returns False
                x = a + ++b; // 6+4=10
            }
                if (x > 20) { // false because 10is not greater than 20
                    System.out.println(x); //this statement will be skipped because of IF condition returns False
                    --x; // this will work and --10=9
                    System.out.println(x); //9
                }
            }

        }

