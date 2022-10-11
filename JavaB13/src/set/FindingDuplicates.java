package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindingDuplicates {
    public static void main(String[] args) {
        // eliminate duplicate elements from given array
        String[] array1= { "b", "c", "a", "d", "c", "k", "a", "c"};
        System.out.println(Arrays.toString(array1));

        // idea1. convert Array to List and then convert List to Set
        List< String> list= Arrays.asList(array1);
        System.out.println(list);
        HashSet<String> set= new HashSet<>(list);
        System.out.println(set);
        System.out.println("======================");

        //idea2. use loop to get each element from array and add it to set
        HashSet<String> set2= new HashSet<>();
        for (String word: array1){
            set2.add(word);
        }
        System.out.println(set2);
        System.out.println("====================");

        // find repeating elements and show them
        //nested for loop
        for (int i=0; i<array1.length; i++){
            for (int k= i+1; k< array1.length;k++){
                if (array1[i]==array1[k]){
                    System.out.println(array1[k]);
                }
            }

        }
        //use set
        HashSet<String> set3= new HashSet<>();
        for (String word: array1){
            if (!set3.add(word)) {
                System.out.println("this is a duplicate " + word);
            }
        }
    }
}
