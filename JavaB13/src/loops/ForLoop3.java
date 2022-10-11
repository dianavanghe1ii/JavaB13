package loops;

public class ForLoop3 {
    public static void main(String[] args) {
        /*
        String str = "today is the best day to  practice for loop"
        print out only letter 't' from the string by using for loop
        // count numbr of ltter 'o' from this string and print
        --> "There are ... letter 'o' in this string"
        */
        String str = "Today is the best day to  practice for loop";
        int count = 0;
        for (int index = 0 ; index <str.length(); index++ ){
            if (str.charAt(index) == 't'){
                System.out.println(str.charAt(index));
            }
            if (str.charAt(index)=='o'){
                count++;
            }

        }
        System.out.println("There are " +count+ " letter 'o' in this string" );
        // =================
        int  counter = 0;
        for (int i = 0; i <=str.length()-1; i++){
            if (str.charAt(i) == 'o'){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
