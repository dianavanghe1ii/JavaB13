package arrays;

public class Task5 {
    public static void main(String[] args) {
        int [] number ={4, 5, 7, 8, 9};
        //find missing number from the sequence
        //create java code to find out missing number from this array
        int sum1 = 0;
        for (int i=0; i<number.length; i++){
            sum1= sum1+number[i];
        }

        //find the sum of numbers between 4 and 9
        int sum2=0;
        for (int i = number[0]; i<=number[number.length-1]; i++){
            sum2= sum2+i;

        }
        System.out.println(sum2-sum1+ " is missing");

    }
}
