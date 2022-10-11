package ifStatement;

import java.util.Scanner;

public class ElseTask2 {
    public static void main(String[] args) {
     /*
    when your purchase is over $100 you will get 205 discount
    otherwise you will get only 5% discount
    -calculate discount for each case and show
    -calculate final amount of payment and show
     */
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter your purchase ammount");
        double purchase$ = scanner.nextDouble();
        if(purchase$ >100){
            //purchase$ * .20--> discount
            // purchase$ * .80--> payment after 20 % discount
            System.out.println("your discount amount is " +(purchase$ *.20));
            System.out.println("you will pay " + (purchase$*.80));

        } else {
            // purchase$ *.05--> discount
            // purchase$ *.95-->> payment after 5 % dicount
            System.out.println("your dicount amount is " + (purchase$*.05));
            System.out.println("you will pay " +(purchase$*.95));
        }
    }


}
