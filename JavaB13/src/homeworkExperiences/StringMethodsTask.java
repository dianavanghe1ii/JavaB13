package homeworkExperiences;
import java.util.Scanner;
public class StringMethodsTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter song name");
        String songName = scanner.nextLine();
// Please do not change anything on lines above.
        System.out.println(songName.charAt(0));
        System.out.println(songName.charAt(songName.length()-1));
        System.out.println(songName.length());
        System.out.println(songName.indexOf('k'));
        System.out.println(songName.charAt(3));
        System.out.println(songName.toUpperCase());
        System.out.println(songName.toLowerCase());
    }
}
//Print the first char of given song name.
//Print the last char of given song name.
//Print the length of the given song name.
//Print the index number of "k" in this song name.
//Print the char from an index number of 3.
//Print the song name in upper case.
//Print the song name in lower case.
//Please do all the printing in the same order listed above and do not add any additional information when printing.
//Example: Input: Mockingbird Output: M d 10 3 k MOCKINGBIRD mockingbird



