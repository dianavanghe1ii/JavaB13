package loops;

public class ForLoop2 {
    public static void main(String[] args) {
        /*
        find the sum of numbers between 0 and 5 by using for loop and show the sum at the end
        0+2+3+4+5 =15
         */
        int sum = 0;
        for (int number =0; number <=5; number++){
          sum +=number;

        }
        System.out.println(sum);

    }
}
