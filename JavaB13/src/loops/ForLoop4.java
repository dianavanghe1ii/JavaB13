package loops;

public class ForLoop4 {
    public static void main(String[] args) {
        /*
        Reverse the given string and print the reversed version as a string
        String str = "Phone"; -- > enohP
         */
        String str = "Phone";
        String reversed = "";

        for ( int index = str.length()-1; index >=0; index-- ){
            reversed += str.charAt(index);

        }
        System.out.println(reversed);

    }
}
