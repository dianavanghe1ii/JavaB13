package loops;

public class WhileLoop2 {
    public static void main(String[] args) {
        /*
        your age is 21
        create a while loop
        --> print "My age is .. age ... " till your age is 30
         */
        int myAge = 21;
        while (myAge<=30){
            int zipcode = 123; // zipcode is local variable and it can be used in the same block only
            System.out.println("My age is " + myAge );
            myAge++;
            zipcode++;
            System.out.println(zipcode);

        }
        // System.out.println(zipcode); since zipcode is local variable , you cannot use it out of the above block
    }
}
