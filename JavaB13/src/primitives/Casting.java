package primitives;

public class Casting {
    public static void main(String[] args) {

        // larger numerical data type to smaller numerical data type
        long lg = 25;
        // int i = lg; compile time error, trying tostore larger data type to smaller data type, requires casting
        System.out.println("lg >> " +lg);
        int i1 = (int) lg;
        System.out.println("i1 >> " + i1); // 25

        long lg2 = 4567788999944342L;
        int i2 = (int) lg2;
        System.out.println(" i2 >> " + i2);
// from decimal tp whole
        double db1 = 2.3;
        System.out.println(" db1 >> " +db1);
        short sh1 = (short) db1;
        System.out.println(" sh1 >> " + sh1);

        short sh2 = (byte) db1;
        byte bt1 = (byte) db1;
        char ch1 = 'd';
        short i3 = (short) ch1;
        System.out.println("i3 >> " + i3);
        byte b1 = 4, b2 = 5;
        byte r1 = (byte) (b1 +b2); // we should the final result of the arithmetic operation
        // to make data type compile/match
        System.out.println("r1 >> " + r1);
        short r2 = (short) (b1 + b2);

        // you bought two phones
        // - short --> 275, short -->800
        //store the total cost as short and show it on the console
         short phone1 = 275, phone2 = 800;
         short cost = (short) (phone1 + phone2);
        System.out.println(" the total cost of the two phones is $" + cost);





    }
}
