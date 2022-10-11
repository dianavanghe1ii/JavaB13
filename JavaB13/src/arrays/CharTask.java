package arrays;

public class CharTask {
    public static void main(String[] args) {
        /*
        {'B', 'Y', '6', 'w', '3', '&', '!', 'd'};
        create an array to store above values
        print numbers only
         */
        char[] mix = {'B', 'Y', '6', 'w', '3', '&', '!', 'd'};
        for (char ch:mix){
            if (ch>='0'&& ch <='9'){
                System.out.println(ch);
            }
        }

        System.out.println("==========Digits=========");
        for (char ch: mix){
            if (Character.isDigit(ch)){
                System.out.println(ch);
            }
        }

        System.out.println("========Letters============");
        for (char ch: mix){

            if (Character.isAlphabetic(ch)){
                System.out.println(ch);
            }
        }

        System.out.println("========Others============");
        for (char ch: mix){

            if (!Character.isAlphabetic(ch) && !Character.isDigit(ch)){
                System.out.println(ch);
            }
        }
    }
}
