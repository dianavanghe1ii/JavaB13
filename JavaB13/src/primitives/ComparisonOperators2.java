package primitives;

public class ComparisonOperators2 {
    public static void main(String[] args) {

        int num1 = 4, num2 = 5;
        boolean r1 = num1 != num2; // true
        System.out.println(r1);

        char ch1 = 'A', ch2 = 'A';
        boolean r2 = ch1 !=ch2;
        System.out.println(r2);
        boolean b1 = 5 == 5;
        boolean b2 = true;
        boolean r3 = b1 != b2;
        System.out.println(r3);
        System.out.println("==========");
        System.out.println(5<5); // false
        System.out.println(5<8); // true
        int number1 = (ch1 + 1) *3;
        boolean r4 = 23 > number1;
        System.out.println("result 4 is " + r4); //false
        // because 'A' = 65 from ASCII , so (65 +1) *3 is not greater than 23
        System.out.println("==============");
        int a = 4, b = 5, c = 10, d =25;
        //less than or equals
        System.out.println(a<=d); //true
        System.out.println(d<=(b+c+b)); //false
        System.out.println((c+d) <= (c+b+b+b)); //true
        System.out.println("==============");
        // greater than or equals
        System.out.println(a>=d); // false
        System.out.println(d>=(b+c+b)); //true
        System.out.println((c+d) >= (c+b+b+b)); //true





    }


}
