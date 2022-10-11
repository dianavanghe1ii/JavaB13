package string;

public class Methods1 {
    public static void main(String[] args) {
        String name ="David";
        int length = name.length();
        // length (); will return number of characters from the string as integer
        System.out.println(name); // David
        System.out.println(length); // 5

        name= name + " White";
         System.out.println( name.length()); //11

        //concat(); will add given string value to the string
        name = name.concat(" is not here.");
        System.out.println(name);
        int b = name.length();
        System.out.println("the length of the new string is " + b);

        //charAt(); takes an index number and returns the char at given index
        char letter = name.charAt(0); // at index 0 on the name --> D
        System.out.println(letter); // prints -->D
        name = "Selenium";
        //      01234567
        char letter2 = name.charAt(2); // returns --> l
        System.out.println(letter2);

       //task: find and store  last letter from string --> "I will do it anyway"  and print it out
        String text = "I will do it anyway tomorrow!";
        int lengthOfText = text.length();
        System.out.println(lengthOfText); // 28

        char lastLetter = text.charAt( lengthOfText -1 );
        System.out.println(lastLetter);
        System.out.println(text.charAt(lengthOfText) -1);








    }
}
