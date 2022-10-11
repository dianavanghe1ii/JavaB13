package loops;

public class NestedForLoop1 {
    public static void main(String[] args) {
        for (int i=0;i<3;i++){
            for (int k=0;k<5;k++){
                System.out.print(i+ " <--i  ");
                System.out.println(k+ " <--k");
                //break; this would terminate inner(nearest) loop

            }
            System.out.println("***********");
            // break; --> this would terminate larger(nearest) loop
//            System.out.println("Hi"); --> this will give compile error
        }
    }
}
