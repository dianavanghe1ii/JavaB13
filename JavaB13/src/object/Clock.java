package object;

public class Clock {
    int countNumbers;
    String shape;
    boolean sound;
    String price;

    public Clock(String price) {
        this.price = price;
    }


    // override toString method in this class to see properties of any Clock object

    public String toString(){
        return countNumbers + ", "+ shape+ ", "+ sound;
    }

    // create a method which defined by using var args parameter
    //this method will find out average miles that a person runs in a week(7)
    //5, 7, 10, 2, 0, 0,5
    public static void averageMiles(int ... mile){
        int sum=0, average;
        for (int number:mile){
            sum+=number;
        }
        average= sum/mile.length;//mile.length -->> taking numbers of parameters
        System.out.println(average);

    }



    public static void main(String[] args) {

        averageMiles(5, 7, 10, 2, 0, 0,5);// mile.length--> taking numbers of parameters
        averageMiles(10,11,4,0,4);// mile.length--> taking numbers of parameters
        averageMiles(20,10);// mile.length--> taking numbers of parameters



        int number = 25;
        System.out.println(number);

        Clock clock = new Clock("a");
        System.out.println(clock);

        Clock clock2= new Clock("a");
        clock2.shape="rectangle";
        System.out.println(clock2);
    }
}
