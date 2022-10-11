package primitives;

public class RemainderPractice2 {
    public static void main(String[] args) {

     /*
     find the product of digit from given numbers
     222==> 2 * 2 * 2 = 8
      */
     int myNum = 105, originalNum = myNum;
     int d1, d2, d3;
     d1 = myNum % 10;
     myNum = myNum / 10;
     d2 = myNum % 10;
     myNum = myNum / 10;
     d3 = myNum % 10;
     myNum = myNum /10;
     System.out.println("The product of the digits of " + originalNum + " is " + (d1 * d2 * d3));


    }
}
