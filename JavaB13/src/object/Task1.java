package object;

import java.net.BindException;
import java.util.Arrays;

public class Task1 {
    /*create a  task 1 class under object package
    create a method that will return an array for every letter of given String
    parameter of the method will be string
    Ex: "Phone" --> [P, h, o, n,e]
    */
    public static char[] letterOfString(String text){
        char[] letters = new char[text.length()];
        for (int index = 0; index<text.length();index++){
            letters[index]= text.charAt(index);
        }
        return letters;
    }
    // Overloading method:
    // count and return number of elements from given string

    public static int letterOfString(String [] items){
        return items.length;
    }

    public static void main(String[] args) {

        char[] array1 = letterOfString("Case");
        System.out.println(Arrays.toString(array1));
        System.out.println();

        System.out.println(Arrays.toString(letterOfString("Phone")) );

        // calling the method
        //creating String array to pass in to method as parameter
        String[] items= {"phone", "Case", "Earphones"};

       int count=  letterOfString(items);
        System.out.println(count+ " << elements in the given array");
        System.out.println(items);
    }
}
