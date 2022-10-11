package loops;

public class DoWhile1 {
    public static void main(String[] args) {
        int a = 10, b = 15;
        while (a>b){
            System.out.println("WHILE LOOP");
        }
        //=============
        a = 10; b =15;
        do {
            System.out.println("DO WHILE LOOP");

        }while (b<a);
        //===============
        a = 10; b = 15;
        do {
            System.out.println("DO WHILE LOOP 2");
            a++;

        }while (a<b);
        char letter = 'a';
        int count = 0;
        do {
            System.out.println("Hello World!");
            System.out.println("Count: " + ++count);
            letter++;
        }while (letter <= 'e');
    }
}
