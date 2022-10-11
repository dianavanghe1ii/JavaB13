package object;

public class BankAccount {
    String bankName;
    String accountHolderName;
    double balance;
    int accountNumber;
    String userName;
    String password;
    boolean isLoggedIn;
    /*
    *create a method to display account info
    *create a method, deposit() which is updating balance and return balance
    * create a method withdraw() which is updating balance and return balance
    * create a method which checks if the user logged in or not, returns true/false
     */
    public void accountInfo(){
        if (isLoggedIn==true){
        System.out.println("Bank name: " + bankName + "\nAccount Holder Name: " + accountHolderName + "\nBalance: " +
               balance + "\nAccount Number: " + accountNumber+ "\nUser Name: " + userName+ "\nPassword: " +
                password+ "\nLogged In: " + isLoggedIn   );
    }else {
            System.out.println("Please log in first to see your information");}
    }
    public double deposit(double deposit){
        balance+=deposit;
        System.out.println("Your new balance after deposit amount of "+deposit+ " is " +balance);
        return balance;
    }
    public double withdraw(double withdrawal){
        balance-=withdrawal;
        System.out.println("Your new balance after withdrawal amount of "+ withdrawal+" is " +balance);
        return balance;
    }
    public boolean isLoggedIn(String usersUserName, String usersPassword){
       if (userName.equals(usersUserName)&& password.equals(usersPassword)){
           isLoggedIn=true;
           System.out.println("You successfully logged in");
       }
       else{
            isLoggedIn=false;
           System.out.println("Either username or password is not matching");
       }
       return isLoggedIn;
    }

}
