package loops;

public class Task1 {
    public static void main(String[] args) {
        /*
        String str = "tR4#y7";
        count and print number of letters, digits and other symbols from given String
         "There are 3 number of Letters"
         "There are 2 number of Digits"
         "There are 2 number of Symbols"
         */
        String str = "tR4#y7";
        int index = 0; //i=indexNumber
        int letterCount = 0;
        int digitCount =0;
        int symbolCount = 0;
        while (index < str.length()) {
            char ch = str.charAt(index);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                letterCount++;

            }else if(ch >= '0' && ch <='9'){
                digitCount++;
            }else {
                symbolCount++;
            }
            index++;

        }
        System.out.println("There are " + letterCount + " Letters in the given string");
        System.out.println("There are " + digitCount + " Digits in the given string");
        System.out.println("There are " + symbolCount + " Symbols in the given string");
    }

}
