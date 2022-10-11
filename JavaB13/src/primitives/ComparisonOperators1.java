package primitives;

public class ComparisonOperators1 {
    public static void main(String[] args) {
         int num1 = 35, num2 = 20 +15;
         // == equals
        boolean result1 = num1 == num2;
        System.out.println(result1); // true

        boolean result2 = num1 == num2--; // true
        System.out.println(result2);

        boolean result3 = num1 == num2;
        System.out.println(result3); // false

        num2++;
        System.out.println(num1 == num2); // true
        System.out.println(num1 == num2++); // true
        System.out.println(num1 == num2++); // false
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("==============");
        System.out.println(num1 == --num2); // false
        System.out.println(num1);
        System.out.println(num2);





    }
}
