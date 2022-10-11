package object;

public class Math2 {
    public void sumCalculator1(int num1, int num2){
        int total1= num1+num2;
        System.out.println("Total1 is "+total1);
    }
    public int sumCalculator2(int num1, int num2){
        int total2= num1+num2;
        System.out.println("Total2 is "+total2);
        return total2;
    }
    public String sumCalculator3(int num1, int num2){
        int total3= num1+num2;
        return "The total3 is " +total3;
    }

    // create method that takes your first name and last name
    // this method will returns
    // your full name
    //prints your full name

    public String fullName(String firstName, String lastName){
        System.out.println("your full name is "+ firstName+" "+ lastName);
        return firstName+lastName;
    }
}
