package primitives;

public class Task2 {
    public static void main(String[] args) {

        /*
        delivery fee,
        if the location is in the range of 10 miles or less,
        delivery fee will be $5.99
        otherwise delivery fee will be $10.99
        if large pizza is $17.99 and your location is 10 miles away from the store
        -calculate and print the total payment
         print that you are paying less delivery fee
         -true or false
         */
        double delFee1 = 5.99, pizza = 17.99;
        double ordertotal = delFee1 + pizza;
        System.out.println("Total payment is " + ordertotal);
        int locMiles = 10;
        int limit = 10;
        boolean payLessOrNot1 = limit >=locMiles;
        boolean payLessOrNot2 = locMiles <=limit;
        System.out.println("Your are paying less delivery fee: " + payLessOrNot1);
        System.out.println("Your are paying less delivery fee: " + payLessOrNot2);


    }
}
