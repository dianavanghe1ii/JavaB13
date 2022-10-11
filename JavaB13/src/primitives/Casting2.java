package primitives;

public class Casting2 {
    public static void main(String[] args) {
        // 127 the highest value for byte and -128 the lowest value

        byte b1 = 127, b2 = 1;
        byte r1 = (byte) (b1 +b2);
        System.out.println("resul: " + r1); // -128


    }
}
