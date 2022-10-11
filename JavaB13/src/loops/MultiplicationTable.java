package loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        /*
        use nested for loop to create multiplication table numbers 1 to 5
        1 * 1 = 1
        1 * 2 = 2
        ...
        1 * 10 = 10
        ******
           skip table for 2's and 4's
            */
        for (int num1=1;num1<=5; num1++){
            if (num1==2 || num1==4){
                continue;
            }

            for (int num2=1; num2<=10; num2++) {

                System.out.println(num1+ " * " + num2 + " = " +num1*num2);
            }
        }
    }
}
