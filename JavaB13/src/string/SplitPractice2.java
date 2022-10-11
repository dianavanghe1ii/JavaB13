package string;

import java.util.Arrays;

public class SplitPractice2 {
    public static void main(String[] args) {
        String str= "I want to solve this question in two minutes";
        //separate every single word as an element
        //get every word as single element from this string
        System.out.println(Arrays.toString(str.split(" ")));// spilt the str from spaces, print as whole String array
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words)); //print as whole array
        for (int i = 0; i< words.length; i++){// traditional for loop one by one
            System.out.println(words[i]);

        }
        System.out.println("====================");
        for (String c:words){ // for each loop one by one
            System.out.println(c);
        }

        }

    }

