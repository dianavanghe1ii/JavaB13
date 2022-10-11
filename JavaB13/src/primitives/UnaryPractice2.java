package primitives;

public class UnaryPractice2 {
    public static void main(String[] args) {
        //pre-incement, pre-decrememt --> ++name, --name
        //post-increment, post-decrement --> name++, name--

        int burgers = 20;
        int sum = burgers++ + ++burgers + 5 + ++burgers/2;
        System.out.println("The sum is: " + sum);
        System.out.println("Burger number is: " + burgers);
int a = ++burgers, b = a++, c = --burgers;
        System.out.println(a); //25
        System.out.println(b); // 24
        System.out.println(c); //23
        System.out.println(++a + --b); //49




    }
}
