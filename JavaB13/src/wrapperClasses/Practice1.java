package wrapperClasses;

public class Practice1 {
    public static void main(String[] args) {

        byte bt= 6;
        Byte b= new Byte(bt);
        System.out.println(b);// 6

        Byte b1= new Byte("7");
        Integer i = new Integer(5);
        Long l= new Long(100);
        System.out.println(l);//100
        Character c= new Character('C');
        System.out.println(c);//C
        Boolean bl= new Boolean(true);
        boolean blPrimitive= true;
        System.out.println(bl);// true
        System.out.println(blPrimitive);
        // Autoboxing
        Integer number=11;// Autoboxing --> primitive data is converted to Wrapper object by Java
        Integer number1=11;
        System.out.println("===========");
        System.out.println(number==number1);
        System.out.println(number.equals(number1));

        System.out.println("============");
        Integer num1= new Integer(2);
        Integer num2= new Integer(2);

        System.out.println(num1==num2); // because == always checks the objects
        System.out.println(num1.equals(num2));// because equals always checks the value of String or Integer or ...


        Character letter= 'a';// Autoboxing
        // Casting--> larger to smaller or decimal to whole number
        //         --> auto casting --> smaller to large
        Integer num3= (int)3.4;// casting and autoboxing
        // Wrapper to primitive: Unboxing
        Integer num4=66;

        int num5= num4;//Unboxing--> Wrapper Object  is converted to primitive data
        Long num7= 3L;
        Long num6= (long)5.6;
        System.out.println((int)(5.6));
        Long num8= Long.valueOf((int)(5.6));
    }
}
