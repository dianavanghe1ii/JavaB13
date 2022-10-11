package loops;

public class BreakStatement {
    public static void main(String[] args) {

        OUTER:
        for (int i=0;i<9;i++){
            INNER:
            for (int k=0;k<15;k++){
                System.out.print(i+ " <--i  ");
                System.out.println(k+ " <--k");
                //break; this would terminate inner(nearest) loop
                if (k<10 && k>7){
                    break;
                }
                System.out.println("learning break statement");
                break OUTER;

            }
            System.out.println("***********");
            // break; --> this would terminate larger(nearest) loop

        }
    }
}
