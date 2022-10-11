package primitives;

public class LogicalNegation {
    public static void main(String[] args) {
        //LogicalNegation --> ! --> it will be used on boolean variables or boolean conditions to show the opposite result

        boolean isRed = !false;
        System.out.println(isRed); // --> false
        System.out.println(isRed);
        System.out.println(isRed);
        System.out.println(isRed);

        System.out.println(!isRed); // --> false

        System.out.println(5 == 5);
        System.out.println(!(5 == 5));
        System.out.println("-------");
        System.out.println(true == false);
        System.out.println(!((true == false) == (true == false)) ); // false





    }
}
