package loops;

public class ForLoop1 {
    public static void main(String[] args) {
        //using while loop print numbers less than 10
//        int number = 1;
//        while (number<10){
//            System.out.println(number);
//            number++;
//        }
        // using for loop print numbrs 1 to 10
        for ( int a =1 ; a< 10 ; a++ ){
            System.out.println(a);

        }
        // System.out.println(a); since 'a' is a local variable in the far loop
        //we cannot access it from out of the scope of for loop

        // use for loop and print numbers from 5 to -5
        for ( int b=5; b>=-5; b-- ) {
            System.out.println("b ->" + b);
        }
        System.out.println("=====================");
        int b = 5;
        for ( ; b>=-5; ) {
            System.out.println(b);
            b--;
        }
        System.out.println("============");
        //below for loop is INFINITE for loop
//        for ( ; ; ){
//            System.out.println("nothing in the for parameter parenthesis");
        }
    }

