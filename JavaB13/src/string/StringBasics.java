package string;

public class StringBasics {
    public static void main(String[] args) {

        System.out.println("Sunday");
        String word = "Tuesday";
        System.out.println(word);
        String name = new String("David");
        System.out.println(name);
        System.out.println(word + name);
        word = name + "Souza";
        System.out.println(word);
        System.out.println("===================");
        System.out.println(name + " Souza");
        System.out.println(name);
        System.out.println(name + 55 ); // David55
        System.out.println(name + 6 + 7); // David 67 (if it starts with text then everything is read as text no addition
        System.out.println(6+7 + name); //13David (if it starts with arithmetical operation it read it first and then the tex

        String result = name + " Brown ";
        System.out.println(result);
        result += result; //
        System.out.println(result);
        // string is immutable(unchangeable), unless you reasign a new value or do concatenation(adding extra text/String to it)
        result = result + " Monday ";
        System.out.println(result);

        String flower = "Rose";
        System.out.println(flower); // Rose
        // we have to reasign otherwise is unchangeable
        flower = flower.concat(" is Red");
        System.out.println(flower); // Rose is Red
        System.out.println(flower.concat(" and beautiful"));
        System.out.println(flower); // String is immutable(unchangeable) so it will still shows
        // --> Rose is Red without .. and beautiful);

        int number1 = 5; // Primitives do not have methods/function but OBJECTS have behavior/function

        String number = "1";
        number +="2";
        number +=2;
        System.out.println(number); //122

        number +=true;
        System.out.println(number);

        int x = Byte.MAX_VALUE;
        System.out.println(x);



    }
}
