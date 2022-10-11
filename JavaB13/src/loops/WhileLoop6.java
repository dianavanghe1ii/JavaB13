package loops;

public class WhileLoop6 {
    public static void main(String[] args) {
        String word = "Summer is here";
        // print out every single letter one by oneseparated by comma.
        //--> W, a, t, ...

        int indexNumber = 0;
        while (indexNumber< word.length()){
            System.out.print(word.charAt(indexNumber) + ", ");
            indexNumber++;

            }
        System.out.println("===============");
        // print the word from end to beginning
        //Summer --> r, e, m, m, u, S,
        int i = word.length()-1;
        while (i >= 0){
            System.out.print(word.charAt(i)+", ");
            i--;

        }
    }
}
