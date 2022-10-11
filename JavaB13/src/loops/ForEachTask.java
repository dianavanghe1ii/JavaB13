package loops;

import java.util.Arrays;

public class ForEachTask {
    public static void main(String[] args) {
        /*
        String[] names={"David", "John", "Diana","Mustafa", "Kuba", "Gulistan"};
        >> david@techtorial.com...
        >> store these e-mails into an array
        >> show all e-mails
         */
        String[] names={"David", "John", "Diana","Mustafa", "Kuba", "Gulistan"};
        String[] emails= new String[names.length];
        int i=0;
        for (String name: names) {
            System.out.println( name.toLowerCase().concat("@techtorial.com"));
            emails[i]=name.toLowerCase().concat("@techtorial.com");
            i++;
        }
        System.out.println(Arrays.toString(emails));
        //print out the email address just for 'Mustafa'
        for (String email : emails){
            if (email.contains("mustafa")){
                System.out.println("Mustafa's email is " +email);
            }
        }
    }
}
