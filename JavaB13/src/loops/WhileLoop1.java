package loops;

public class WhileLoop1 {
    public static void main(String[] args) {
        int count = 0;

        while (count <= 10) {
            System.out.println(count + "-Sunday");
            count++;

        }
        System.out.println("this is count after loop >>" + count);//11
        while (count>=0){
            System.out.println(count + ".Morning");
            count--;
        }

        int number = 4;
        //Blow loop is called 'infinite loop' it will never stop since there is no conditional update
        // (it is always true)
        //while ((number == 4)){
        //System.out.println("Study");
        }
    }

