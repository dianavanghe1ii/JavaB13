package ternary;

public class Practice1 {
    public static void main(String[] args) {
        int i = 5, j = 10;
        System.out.println(i < j ? "Hi" : "Bye"); // "Hi"
        System.out.println( i < j ? i + j : j - i); // i+j = 15
        System.out.println( i < j ? "Got it" : i * j); //Got it
        String result =i < j ? "Hi" : "Bye";
        System.out.println(result);//Hi
        int result1 = i < j ? i + j : j - i;
        //i < j ? "Got it" : i * j; // you can not store the result for this implementation
                                    // since options are having different data types
        System.out.println("Hi".equals(result)); // true
        System.out.println(25 > result1); // true

    }
}
