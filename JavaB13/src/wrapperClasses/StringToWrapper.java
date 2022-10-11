package wrapperClasses;

public class StringToWrapper {
    public static void main(String[] args) {

        String str= "17.5";
        // convert above string to wrapper object Float
        // valueOf();
        Float number= Float.valueOf(str);
        float num= Float.valueOf(str);
        System.out.println(number+10);// 27.5
        float number1=Float.parseFloat(str);// returns primitive
        Float number2= Float.parseFloat(str);// returns object

        int num1= 19;
        Integer i= Integer.valueOf(num1);

    }
}
