package loops;

public class ContinueStatement {
    public static void main(String[] args) {
        OUTER:
        for (int i=0;i<9;i++){
            if (i==5){
                continue ;
            }
            INNER:
            for (int k=0;k<15;k++){
                if (k>5&&k<10){
                    continue ;
                }
                System.out.print(i+ " <--i  ");
                System.out.println(k+ " <--k");
                //break; this would terminate inner(nearest) loop

                continue;

            }
            System.out.println("***********");
            // break; --> this would terminate larger(nearest) loop

        }
    }
}
