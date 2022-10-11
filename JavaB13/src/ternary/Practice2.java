package ternary;

public class Practice2 {
    public static void main(String[] args) {
        String name1 = "Techtorial";
        String name2 = "Academy";

        String result =  name1.contains(name2) ? name1.concat(name2) : name1 + " does not contain " + name2;
        System.out.println(name1.contains(name2) ? name1.concat(name2) : name1 + " does not contain " + name2);
        System.out.println(result);
        name1 = name1+ " " + name2;
        System.out.println(name1);
        String result2 = result.equalsIgnoreCase(name1) ? result.toUpperCase() : name1.toUpperCase();
        System.out.println(result2); // TECHTORIAL ACADEMY
        System.out.println('a' > 'b' ? 6.5 : "Zachary"); //Zachary because its false
        int a = 3, b = 5;
        int x = ++a + ++a + ++b; // 4 + 5 +6 = 15
        System.out.println(x);
        System.out.println( x > ++a +b ? a++ : b++);// (is 15> 6+6) True --> 6 because it a++(after, not yet)
        System.out.println("true".equals(true) ? "yes" : "no"); // no (because true is object and "true" is word)
        System.out.println( 5==5 ? "Sunday" : 3>2 ? "Morning" : "Afternoon"); // "Sunday"
        System.out.println( 5!=5 ? "Sunday" : 3>2 ? "Morning" : "Afternoon"); // Morning because 3>2



    }
}
