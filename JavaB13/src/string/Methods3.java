package string;

public class Methods3 {
    public static void main(String[] args) {

       //toLowerCase(), toUpperCase(), returns string
        String text = "Do whatever IT takes to be successful";
        text = text.toLowerCase();
        System.out.println(text);
        text = text.toUpperCase();
        System.out.println(text);
        //
        System.out.println(text.toLowerCase());
        // startsWith(); endsWith(); returns true/false

        boolean r1 = text.startsWith("d");
        System.out.println(r1); //

        boolean r2 = text.startsWith("DO");
        System.out.println(r2);
        boolean r3 = text.startsWith("TAKES");
        System.out.println(r3); // false because the value does not start with TAKES
        boolean r4 = text.endsWith("UL");
        System.out.println(r4); // true
        System.out.println(text.endsWith("DO WHATEVER IT TAKES TO BE SUCCESSFUL")); // true

        // equals(); equalsIgnoreCase(); returns boolean True/false
        String str1 = "Red";
        String  str2 = "RED";
        boolean areSame1 =  str1.equals("red");
        System.out.println(areSame1);
        System.out.println(str1.equals("ed"));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals (str2.toLowerCase())); //false because )str.toLowerCase = red
        // and it is not equal to str1
        System.out.println(str1.toUpperCase() == str2); // true because str1.toUpperCase = RED and equals to str2
        System.out.println(str1.equalsIgnoreCase("ReD")); //true because it ignores Case
        System.out.println(str1.equalsIgnoreCase( "White")); //false
        // System.out.println(str1.toUpperCase() == str2);
        str1 = str1.toUpperCase();
        System.out.println(str1.equals(str2));

        String language = "java";
        // replace(); old char by new char // old string by new string

        String newLanguage= language.replace('v', 'x');
        System.out.println(newLanguage);
        System.out.println(newLanguage.replace('x', 'v'));
        System.out.println(newLanguage);
        System.out.println("====================");
        System.out.println(language.replace('y', '*'));
        System.out.println(language.replace('a', '$')); // all 'a' will be replaced with $ sign
        language = language.replace("va", "da");
        System.out.println(language);
        System.out.println(language.replace("da", "YES")); //jaYES
        System.out.println(language.replace("jada", "English"));
        System.out.println(language.replace("d", " I like this replacement method"));
        language = language.replace( "d", "v");











    }
}
