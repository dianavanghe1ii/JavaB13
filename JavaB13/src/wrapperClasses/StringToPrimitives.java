package wrapperClasses;

public class StringToPrimitives {
    public static void main(String[] args) {
        String str= "15";
        System.out.println(str);



        System.out.println(15+str);// 1515
        System.out.println(str+15);// 1515
        System.out.println(15+15+str);//3015
        System.out.println(str+15+15);//151515
        System.out.println(str+15*15);// 15225
        System.out.println(15*15+str);//22515
        System.out.println("=================");
        int number= Integer.parseInt(str);
        System.out.println(number);//15 but now is int
//        System.out.println(str==number);// its not object object, it's object primitive
//        System.out.println("=================");
//        System.out.println(15+str);// 1515
//        System.out.println(str+15);// 1515
//        System.out.println(15+15+str);//3015          no change because we are using str and not number
//        System.out.println(str+15+15);//151515
//        System.out.println(str+15*15);// 15225
        System.out.println(number+15);//30
        System.out.println(15+number);//30
        System.out.println(3*number);//45

        //convert string to double
        String str1="11.5";
        double decimalNumber=Double.parseDouble(str1);// storing as primitive double
        // from string to wrapper Object

        Double decimalNumberObject=Double.parseDouble(str1); //first parse to primitive double,
        // then store in object with help of Autoboxing
        System.out.println(decimalNumber-3);//8.5

//        int number1= Integer.parseInt(str1);// NumberFormatException
//        System.out.println(number1);//  because of the dot in 11.5 that cannot be int but double
        String str2= "A";
        // you cannot parse to Character
        String str3= "true";
        boolean t= Boolean.parseBoolean(str3);
        System.out.println(">>>> "+t+"<<<<");//>>>> true <<<<
        System.out.println(t==true);//true
        Boolean tt=t;// Autoboxing: from primitive to object Boolean
        System.out.println(tt.equals(t));// true


    }
}
