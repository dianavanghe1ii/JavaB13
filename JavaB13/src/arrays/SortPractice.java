package arrays;

import java.util.Arrays;

public class SortPractice {
    public static void main(String[] args) {
        int [] numbers = {4,3,7,19,23,440,1,100};
        //before sort
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);// it will sort given array in ascending order
        //after sort
        System.out.println(Arrays.toString(numbers));
        //find smallest? find largest?
        System.out.println(numbers[0]);// smallest
        System.out.println(numbers[numbers.length-1]); //largest
        String[] snacks={"chips", "fries", "cookies", "fruit", "broccoli"};
        System.out.println(Arrays.toString(snacks));
        //sort
        //Arrays.sort(snacks);
        System.out.println(Arrays.toString(snacks));
        //print every single element as upperCase snacks array

        System.out.println(Arrays.toString(snacks).toUpperCase());
        Arrays.sort(snacks);
        System.out.println(Arrays.toString(snacks));
        for (int i = 0; i<snacks.length; i++){
            snacks[i]=snacks[i].toUpperCase();
        }
        Arrays.sort(snacks);
        System.out.println(Arrays.toString(snacks));
    }
}
