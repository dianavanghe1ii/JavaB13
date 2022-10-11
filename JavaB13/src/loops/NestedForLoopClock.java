package loops;

public class NestedForLoopClock {
    public static void main(String[] args) {
        /*
        print minutes and hours for the hours from 1 to 11
        1:0
        1:1
        1:2
        1:59
        2:0
        2:1
        ..
        ..
        11:58
        11:59
         */
        // print only minutes till 25

        FIRST:
        for (int hour=1;hour<=11; hour++ ){
            SECOND:
            for (int minute=0; minute<=59; minute++){
                if (minute==25) {
                    break FIRST;
                }
                THIRD:
                for (int second = 0;second<60;second++) // or second<=59
                System.out.println(hour+" : "+minute + " : " +second);
            }
        }
    }
}
