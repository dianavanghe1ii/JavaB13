package loops;

public class Task3 {
    public static void main(String[] args) {
        /*
        use for loop upper case alphabet by separating each letter with '-'
        outcome "A- B- C- ... Z"

        print 'Q' without dash
        print 'W' as 'w'
        *L*
         */


        for (char ch = 'A'; ch<= 'Z'; ch++){
            if (ch!='Z' && ch!='Q' && ch!='W' &&ch!='L'){
                System.out.print( ch+ "-");
            } else if(ch=='W'){
                System.out.print('w'+ "-");
            }else if (ch=='L'){
                System.out.print("*"+ch+"*");
            }else {
                System.out.print(ch);
            }
//            if (ch!='Z' && ch!='Q' && ch!='W'){
//                System.out.print( ch+ "-");
//            } else if(ch =='W'){
//                System.out.print('w'+ "-");
//            }else{
//                System.out.print(ch);
//        }
//            if (ch!='Z' && ch!='Q'){
//                System.out.print( ch+ "-");
//            } else{
//                System.out.print(ch);
//            }
//            if (ch=='Z'){
////                System.out.println(ch);
////            } else {
////                System.out.println( ch+ "-");
////            }



        }
    }
}
