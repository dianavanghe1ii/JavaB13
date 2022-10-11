package arrays;

import java.util.Arrays;

public class MultiDimentional1 {
    public static void main(String[] args) {
        int[][] numbers = new int[3][4];

        // indexing
        numbers[0][1] = 22;
        numbers[0][0] = 11;

        System.out.println(numbers[0][1]);
        System.out.println(numbers[0][0]);
        // print all elements
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.deepToString(numbers));//[[11, 22, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]
        numbers[1][1] = 33;
        System.out.println(Arrays.deepToString(numbers));
        numbers[2][3] = 99;
        System.out.println(Arrays.deepToString(numbers));
        numbers[numbers.length - 1][numbers[numbers.length-1].length-1] = 666;// [[11, 22, 0, 0], [0, 33, 0, 0], [0, 0, 0, 100]]
        System.out.println(Arrays.deepToString(numbers));
        //one by one
        for (int[] numberArray: numbers){
            System.out.println(Arrays.toString(numberArray));
            for ( int number:numberArray ){
                System.out.println("Individual number >>> " + number);
            }
        }
    }

}
