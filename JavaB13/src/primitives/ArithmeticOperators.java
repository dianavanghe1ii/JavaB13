package primitives;

public class ArithmeticOperators {

    public static void main(String[] args) {

        int a = 3, b = 5, c = 8, d = b + 5;

        // +, -, *, /, %(modulus)
        c = c + b + d; //23

        System.out.println( "The value of c: " + c);

        System.out.println( c- 11); //12

        int result1 = a*c; //3*23=> 69

        System.out.println(result1);

        int result2 = result1 / 2; // 69/ 2 =. 34.5

        System.out.println(result2);

        double result3 = result1 / 2; //69 / 2=> 34.5

        System.out.println(result3);

        float result4 = result1 / 2;

        System.out.println(result4);

        float result5 = result1 /2f;

        System.out.println(result5);

        //modulus --> % remainder from division
        // 12 sand. --> for each person. there are 5 people --> remainder is 2

        int x = 11, y = 2;

        int remainder1 =  x % y;

        System.out.println(remainder1); //1

        System.out.println(16 % 10);

        double r2 = 53 % 3;
        System.out.println(r2);
        System.out.println( 450 % 100); //50
        /*
        TASK: if theere are 35 burgers and 10 kids at the picnic
        when every child got equal amount of burgers
        find out and show how many burgers left over "... burgers left over"
        */
        int burgers = 35, kids = 10, remainder = burgers % kids;

        System.out.println(remainder + " burgers left over");






    }
}
