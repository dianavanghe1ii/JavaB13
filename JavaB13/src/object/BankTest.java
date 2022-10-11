package object;

public class BankTest {
    public static void main(String[] args) {
       BankAccount account= new BankAccount();
       account.userName= "Java";
       account.password= "123";
       account.isLoggedIn("Java", "123"  );
       account.deposit(10000);
       account.withdraw(100);
       account.accountInfo();
    }
}
