package ifStatement;

public class ElseIfPractice {
    public static void main(String[] args) {
        // pick a number between 0 and 15
        // if the number is between 0 and 5 --> print --> "your number is in the range of 0 - 5"
        //if the number is between 5 and 10 --> print --> "your number is in the range of 6 - 10"
        //if the number is between 10 and 15 --> print --> "your number is in the range of 11 - 15"
 int number = 3;
 if(number>=0 && number <=5){
     System.out.println("your number is in the range of 0 - 5");
 } else if(number>=6 && number<=10){
     System.out.println("your number is in the range of 6 - 10");
 } else if(number >=11 && number<16){
     System.out.println("your number is in the range of 11 - 15");
 } else {
     System.out.println("Your number is out of range");
 }
 }
}
