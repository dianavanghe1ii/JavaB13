package loops;

public class WhileLoop7 {
    public static void main(String[] args) {
        /*
        you have $40 in your international phone calling account
        every all costs $5
        find out how many calls you can make with the $40
        --> 'This is your 1 call. remaining balance is ..."
         */
        int balance = 40, callCost = 5, count=0;
        while (balance>=callCost){
            count++;
            balance= balance - callCost;
            System.out.println("This is your " + count + ". call. Remaining balance is " + balance);
           // System.out.println("This is your " + ++count + ". call. Remaining balance is " + (balance-callCost));


        }
    }
}
