package ifStatement;

public class NestedPractice1 {
    public static void main(String[] args) {
        // passport, visa,ticket
        boolean passport = false;
        boolean visa = true;
        boolean ticket = true;
        if(passport==true){
            System.out.println("You have passport, try for visa");
            if(visa==true) {
                System.out.println("you have visa, buy ticket");
                if(ticket==true){
                    System.out.println("good news, you can now fly to your destination");
                }else {
                    System.out.println("You need to buy ticket");
                }
            } else {
                System.out.println("you need to get Visa");
            }
        } else{
            System.out.println("you need to get a Passport");
        }
    }
}
