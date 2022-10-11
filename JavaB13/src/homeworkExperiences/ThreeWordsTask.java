package homeworkExperiences;
import  java.util.Scanner;
public class ThreeWordsTask {
    public static void main(String[] args) {
        System.out.println("Please enter a string with three words.");
        String threeWords = new Scanner(System.in).nextLine();
        // task1
        int space1 = threeWords.indexOf(" ");
        int space2 = threeWords.indexOf(" ",space1 +1);
        String word1 = threeWords.substring(0, space1);
        String word2 =threeWords.substring(space1 +1,space2);
        String word3 =threeWords.substring(space2 +1);
        //task2
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        //task3
        System.out.println((word1.charAt(0) + "" + (word2.charAt(0)) + "" + (word3.charAt(0))));
        //task4
        System.out.println( (word1.charAt(word1.length()-1)) + "" + (word2.charAt(word2.length()-1)) + "" +
                (word3.charAt(word3.length()-1)) );
        //task5
        int word1length = word1.length();
        int word2length = word2.length();
        int word3length = word3.length();
        boolean result = (word1length==word2length) && (word2length== word3length);
        System.out.println(result);


        // Please don't change anything on lines above.

    }

}
//1- Find the first word, second word, and third word from the string and create three different string variables for them.
// 2- Print first word, second word and third word from the threeWords string in order.
// 2- Print the first char of those three string together.
// 3- Print the last char of each string together.
// 4- Print true if each of the word length is equaled to each other.
//
//EXAMPLE: Input : We Love Java OUTPUT: We -> First word Love -> Second word Java ->
// Third word WLJ -> Initials of words eea -> Last letters of words. false ->
// (since every word in string doesn't have the same value.)
