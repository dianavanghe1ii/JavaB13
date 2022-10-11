package homework;
import  java.util.*;
public class Duplicates {
    // create a method here
    // Please make sure your access modifier is public,
    //return type of your method is int array and name of your method is duplicates
    public int[] duplicates(int[] numbers1, int[] numbers2) {
        String commonElements = "";
        for (int i = 0; i < numbers1.length; i++) {
            for (int j = 0; j < numbers2.length; j++) {
                if (numbers1[i] == numbers2[j]) {
                    commonElements += numbers1[i] + " ";
                }
            }
        }
        if (commonElements.length() == 0) {
            return null;
        }
        String[] commonArray = commonElements.trim().split(" ");
        String noDuplicates = " ";
        for (int i = 0; i < commonArray.length; i++) {
            if (!noDuplicates.contains(" " + commonArray[i] + " ")) {
                noDuplicates += commonArray[i] + " ";
            }
            }
        String[] noDuplicatesArray = noDuplicates.trim().split(" ");
        int[] commonNumbers = new int[noDuplicatesArray.length];
        for (int i = 0; i < commonNumbers.length; i++) {
            commonNumbers[i] = Integer.parseInt(noDuplicatesArray[i]);
            }
        Arrays.sort(commonNumbers);
        return commonNumbers;

        }
    }


