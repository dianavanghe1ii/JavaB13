package primitives;

public class NumericPromotion {
    public static void main(String[] args) {
        byte b1 = 3;
        short sh1 = 4;
        System.out.println( b1 + sh1);

        //  byte r1 = b1 + sh1; // compile time error
        //  short r1 = b1 +s1; // compile time error
        int r1 = b1 +sh1;
        System.out.println(r1);
        float f1 = 2.3f;
        double d1 = 4.4;
        double d2 = 4.3;
        // float r2 = f1 + d1; compile time error  because java will promote smaller data type to the larger
                        // when you do arithmetic operations with different data types
        double r2 = f1 + d1;
        System.out.println(r2); //6.8

        int i2 = 5;
        // int r3 = d1 + i2;
        double r4 = i2 + d1;
        System.out.println(r4);
        System.out.println(d1 + d2);
        int i3 = 35000_000;
        int i4 = 35000_000;
        int r5 = i3 * i4;
        System.out.println(r5);





    }
}
