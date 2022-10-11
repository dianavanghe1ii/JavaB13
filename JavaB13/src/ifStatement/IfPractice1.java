package ifStatement;

public class IfPractice1 {
    public static void main(String[] args){
        System.out.println("this is beggining of the code");
        // if
        if( 3==3 ){
            System.out.println("This is inside of I Block");
        if( 3==5 ){
            System.out.println("This is second IF Block");
        }

        }
        System.out.println("This is the end of the code");

        // you can have multiple if statements in the same class
        int apple = 20;
        int orange = 40;
        //print out 'HI' when there are more numbers of apples than oranges
        //print out 'BYE' when there is some amount of apples and oranges
        if(apple>orange){
            System.out.println("HI");
        }
        if(apple == orange){
            System.out.println("BYE");

        }
        //each apple costs $2 and each orange costs $3 each
        //you have $100 in your pocket
        // print out 'I can Buy fruits' if your money is enough t buy oranges and apples
        int apple$ = 2, orange$ = 3, myMoney = 100;
        int sumOfFruits = ((apple*apple$)+(orange*orange$));
        if(sumOfFruits<=myMoney){
            System.out.println("I can Buy fruits"); // this will not print since there is not enough money to buy

        }

    }
}
