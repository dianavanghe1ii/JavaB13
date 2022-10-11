package primitives;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int a = 5 + 7 + 6;
        int b = 5 + 4 * 8;
        System.out.println("b>>" + b);
        int c = b -a + 2 * 3 / 1 + 5;
        System.out.println("c >> " + c);

        int count = 18 % 4+ (23 - 10 / 5) * 2 - 1;
        System.out.println(count); // 2 + 42-1 => 43

    }
}
