package primitives;

public class Task1 {
    public static void main(String[] args) {
        int laptop = 1265, payment = 100, lastpayment;
        lastpayment = laptop % payment;
        System.out.println(" The last month's payment is: $" + lastpayment);
    }
}
