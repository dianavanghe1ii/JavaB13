package object;

public class Math1 {
    /*
    create method that will find sum of two numbers and shows it
     */
    public void sum(){
       int a=1,b=2,sum=a+b;
        System.out.println("the sum of a and b is " + sum);
    }
    public void sum1(int num1, int num2){
        int total=num1+num2;
        System.out.println("total is " +total);
    }

    public static void main(String[] args) {
        Math1 object=new Math1();
        object.sum();
        object.sum1(5,8);
        object.sum1(10,15);
        object.product(2.5,2);
    }
    /*
    create a method that will take two double numbers
    and will find the product of given numbers and shows it
    > create a MathTest class and run the product
     */

    public void product(double number1, double number2) {
        System.out.println("the product of "+number1 +" and " + number2+"is " + number1 * number2);
    }

}
