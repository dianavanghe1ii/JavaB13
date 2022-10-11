package arrays;

public class Task3 {
    public static void main(String[] args) {
        // find out the largest number from this given array
        //find teh smallest number from the given array

        int[] studentIds={44,67,5,21,55,99,-35,500,11};
        int largest= studentIds[0];// we are assuming that number 44 is teh argest, compare it with next and keep the largest,
          //so on, until we get to the largest number
          int smallest= studentIds[0];// we are assuming that number 44 is teh argest, compare it with next and keep the largest,
        //so on, until we get to the smallest number

        for (int i=1; i<studentIds.length; i++) {
            if (studentIds[i] > largest) {
                largest = studentIds[i];
            }
            if (studentIds[i] < smallest) { // or we can write it as: smallest> studentIds[i]
                    smallest = studentIds[i];

                }
            }
            System.out.println("the largest number is " + largest);
            System.out.println("The smallest number is " + smallest);
        }
    }
