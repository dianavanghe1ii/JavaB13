package loops;

public class ForEachPractice {
    public static void main(String[] args) {
        String [] cities ={"Chicago", "Springfield", "Denver", "Miami", "Malibu", "New York", "Houston"};
        for ( String city : cities) {
            System.out.println(city);
        }
    //create an integer array, give same values and find the sum of numbers that you have in the array
        //use for-each loop to solve this task
        int[] numbers = {66, 89, 6, 12, 7, 35};
        int sum= 0;
        for (int number : numbers){
            sum=sum+number;
            System.out.println(sum); // 5 times for ex: 66+89, 155+6, 161+12, 173+7, 180+35.

        }
    }

}
