package loops;

public class ForLoopMultipleTerm {
    public static void main(String[] args) {
        int a=9;
        for (a=5;a<7;a++){
            //a=10;--> this is going to cause infinite loop
            System.out.println("s is " + a);
        }
        System.out.println("a after Loop" +a);// 17 because a now after a++ is equal to 17 in the background
        // multiple terms for loop
        int c=0;
        for (int i=0,k=10,m=25 ;i<10&&k>i ; i++,k--  ){
            //c++;
            System.out.println("i --> " +i);
            System.out.println("k --> " +k);
            System.out.println("m --> " +m);
            //"This loop runs ... times"
            System.out.println("This loop runs "+ ++c+" times");

        }
        System.out.println("This loop runs "+c+" times");
        System.out.println("==========");
        char ch = 't';
        double num= 1.2;
        int count=0;
        for (double d=2.3; ch>'m' || d>=num; ch--, num++){
            System.out.println("***********");
            System.out.println(num+" << num");
            System.out.println(ch+" << ch'");
            count++;
        }
        System.out.println(count);
    }
}
