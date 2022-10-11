package object;

import java.util.Arrays;

public class Task1Test {
    public static void main(String[] args) {
        char[] array1 = Task1.letterOfString("Case");
        System.out.println(Arrays.toString(array1));
        System.out.println();

        System.out.println(Arrays.toString(Task1.letterOfString("Phone")) );

        // calling the method
        //creating String array to pass in to method as parameter
        String[] items= {"phone", "Case", "Earphones"};

        int count=  Task1.letterOfString(items);
        System.out.println(count+ " << elements in the given array");
    }
}
