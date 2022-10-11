package object;

public class Netflix {
    /*
    Netflix
    instance fields: user, monthlyData, accountName
    method: streaming();-> update the data by sage amount of every user
                        ->show latest data amount/left over
      */
    String user;
    static String accountName="Family";
    static double monthlyData=200;
    public void streaming(double usage){
        monthlyData=monthlyData-usage;
        System.out.println("After " + user+ " streamed, leftover data is " +monthlyData);
    }

    public static void main(String[] args) {
        Netflix netflix= new Netflix();
        netflix.user= "Kids";
        netflix.streaming(5);
        Netflix netflix2= new Netflix();
        netflix2.user="Dmitri";
        netflix2.streaming(10);
    }
}
