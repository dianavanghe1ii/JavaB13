package arrays;

public class Task2 {
    public static void main(String[] args) {

        // print out numbers that are less than 30
        int[] studentIds={44,67,5,21,55,99,-35,500};

        int index=0;
        while (index<studentIds.length){
            if(studentIds[index]<30) {
                System.out.println(studentIds[index ]);
            }
            index++;
        }
    }
}
