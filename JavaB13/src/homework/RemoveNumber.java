package homework;
import java.util.Arrays;
import  java.util.Scanner;
import  java.util.*;
public class RemoveNumber {
    public static void main(String[] args) {
        int numbers[] ={ 10,4,3,55,32,145,443,234,98,32};
        // Create the array on lines above

        //User is asked for a number below. Please get the number using scanner.
        System.out.println("Please enter number from array");

        int number = new Scanner(System.in).nextInt();
        boolean isContain = false;
        for(int i =0; i<numbers.length;i++){
            if(number == numbers[i]){
                numbers[i]=0;
                isContain = true;
            }
        }
        if(!isContain){
            System.out.println("false");
        }else{
            System.out.println(Arrays.toString(numbers));
        }










    }
}
