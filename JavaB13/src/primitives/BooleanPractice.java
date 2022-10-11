package primitives;

public class BooleanPractice {

    public static void main(String[] args){

        //boolean data type can only take true or false as values

        boolean isEmpty = true;

        System.out.println(isEmpty); //true
        System.out.println(isEmpty);
        System.out.println(isEmpty);
        System.out.println(isEmpty);
        System.out.println(isEmpty);
        System.out.println(isEmpty);

        isEmpty = false;

        System.out.println(isEmpty);
        System.out.println(isEmpty);
        System.out.println(isEmpty);
        System.out.println(isEmpty);
        System.out.println(isEmpty);

        boolean isLightOn = isEmpty;

        System.out.println(isLightOn); // isEmpty --> last value given

        System.out.println(isEmpty);

        System.out.println( !isLightOn ); // Exclamation makes the opposite of the value (true<-->false)

        System.out.println( 5==5); //true

        System.out.println( 5==4); //false






    }
}
