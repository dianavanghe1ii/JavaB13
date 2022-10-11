package arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = {19, 23, 15, 7, 8, 11, 21, 15, 15, 9};
        //find pairs that are making sum of 30
        //print: 19 and 11 makes 30
        // print: 21 and 9 makes 30
        for ( int i=0;i< numbers.length; i++){
            for (int k=i+1;k< numbers.length; k++){
                if (numbers[i] +numbers[k]==30){
                    System.out.println(numbers[i] + " and " + numbers[k] +" makes 30");
                }
            }
        }
    }
}
