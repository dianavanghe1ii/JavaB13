package primitives;

public class Farm {
    public static void main(String[] args) {
        /* calculate the number of the legs in the farm if:
        there are 15 cows and 40 chickens
        -show the result as " There are total of ... legs in this farm"
         */
        int cows = 15, chickens = 40, eachCowleg = 4, eachChickenLeg =2, totalLegs;

        totalLegs = (cows * eachCowleg) + (chickens * eachChickenLeg);
        System.out.println("There are total of " + totalLegs + " legs in this farm");
    /* claculate the total worth of this farm if:
       =each cow is $1200
       =each chicken is $11.99
       -show the result as " The worth of the farm is ... "

     */
        double cow$ = 1200, chicken$ =11.99;
        double worthOfFarm = cows *cow$ + chickens * chicken$;
        System.out.println("The worth of the farm is : $ " + worthOfFarm);

        /*
        build a new barn for the upcoming horses, you are going to spend moey from the worth of your other animals
        -your spending is 100
        -how can you find out how much money you have left after new barn build?
         */
        double spending = 1000;
        System.out.println(worthOfFarm - spending);

    }

}
