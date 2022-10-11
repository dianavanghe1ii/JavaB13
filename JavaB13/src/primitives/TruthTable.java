package primitives;

public class TruthTable {
    public static void main(String[] args) {

        boolean visa = true;
        boolean ticket = true;
        boolean travel1 = visa && ticket;
        System.out.println("Can Travel? " + travel1);
        boolean passport = false;
        boolean travel2 = visa && ticket && passport;
        System.out.println("Can travel with no passport? " + travel2);
        passport = true;
        boolean travel3 = visa && ticket & passport;
        System.out.println("Can travel with new passport? " + travel3);
        boolean travel4 = visa && ticket && !passport;
        System.out.println( "Can you travel if you lost your passport? " + travel4);
        System.out.println("==============");
        //=====OR==========
        boolean cash = true;
        boolean  creditLimit = false;
        boolean canBuy = cash || creditLimit;
        System.out.println("can you buy? " + canBuy);
        System.out.println( "Can you buy? " + (!cash || creditLimit));



    }
}
