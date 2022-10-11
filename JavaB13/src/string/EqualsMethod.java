package string;

public class EqualsMethod {
    public static void main(String[] args) {

        String name1 = new String("David");
        String name2 = new String("David");

        String name3 = "David";
        String name4 = "David";

        String name5 = name1;
        System.out.println(name1.equals(name2)); // true
        System.out.println(name3.equals(name4)); // true
        System.out.println(name1 == name2); // false because the objective(name1 is not the same as name2)
        System.out.println(name3 == name4); //true
        System.out.println(name1.equals(name4)); // true because it compares values
        System.out.println(name1 == name4); // false
        System.out.println(name5.equals(name1));// true
        System.out.println(name5 == name1); // true looking at the same object

        // equals --> look for the values
        // == --> look if they are the same object or not(f they are in the string pool with same value, will also return 'true')
        







        ;


    }
}
