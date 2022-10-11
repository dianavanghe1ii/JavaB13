package arrays;

import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {
        int[] nums = new int[6];
        nums[0]=1;
        //another way to create array
        // this is useful if you know the values before
        int[] numbers={4, 23, 45, 1, -25,100};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
//        numbers[6]=99; // ArrayIndexOutOfBoundsException since capacity of numbers array is 6
//        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[2]); //45
        System.out.println(numbers[0]); //4
        System.out.println(numbers[5]);// 100
        // reach out the last element of the array
        System.out.println(numbers[numbers.length-1]);//100
        //reassignment
        numbers[1]=33;
        System.out.println(Arrays.toString(numbers));


    }
}
