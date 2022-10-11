package string;

public class MethodsTask3 {
    public static void main(String[] args) {
    /*
    String str = " O n e     to    H e r o "
    change One to ZERO
    make all string upper case
    remove all spaces
    get only first 3 characters
    and print those 3 chars
     */

        String str = " O n e     to    H e r o ";
        String part = str.replace("One", "ZERO").toUpperCase().trim()
                .replace(" ", "").substring(0,3);
        System.out.println(part);
        System.out.println(str);
        System.out.println(str.replace("O n e", "ZERO"));


    }
}
