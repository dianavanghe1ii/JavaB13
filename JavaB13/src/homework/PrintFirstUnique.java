package homework;

import java.util.Scanner;

public class PrintFirstUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[7];
        for(int i = 0 ; i < numbers.length; i++){
            System.out.println("Enter number for array");
            numbers[i] = sc.nextInt();
        }
        boolean isThereUnique = false;
        OUTER: for(int i = 0 ; i<numbers.length; i++){
            int num = numbers[i];

            for(int j =0; j<numbers.length; j++){
                if(num == numbers[j]&& i!=j){
                    continue OUTER;
                }
            }
            System.out.println(num);
            isThereUnique = true;
            break;

        }
        if(!isThereUnique){
            System.out.println("Array doesn't have any unique element");
        }

    }
}
