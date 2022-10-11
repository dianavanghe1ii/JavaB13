package object;

public class VarArgsExample {
    /*
    create a method that will find the sum o number from given array

     */
    public static int sumOfNumbers(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {

            sum += sum;
        }
        System.out.println(sum);
        return sum;
    }
    //solving the above question with var arg
    public static int sum1( int ... numbers){
        int sum = 0;
        for (int num : numbers) {

            sum += sum;
        }
        System.out.println(sum);
        return sum;
        //create a method that will take String array and print following message " ** name** take it easy and relax a bit"
    }
    public static void takeItEasy(String[] names){
        for (String name:names){
            System.out.println(name+ " take it easy and relax a bit");
        }
    }
    public static void takeItEasy1(String ... names) {
        for (String name : names) {
            System.out.println(name + " take it easy and relax a bit");
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        sumOfNumbers(nums);
        sum1(10,20,1,3,20);
        System.out.println("============");
        String[] people= {"Kutman", "Kuba", "Kate"};
        takeItEasy(people);
        takeItEasy1("Noza", "Brother", "sister", "David");
        takeItEasy1("Noza", "Brother", "sister", "David", "x", "t", "l ");
    }
}
