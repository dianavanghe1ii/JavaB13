package ifStatement;

import java.util.Scanner;

public class NestedTask2 {
    public static void main(String[] args) {
    /*Lets say there is a candidate for a job interview and s/he will be asked abut java, selenium, API, SQL knowledge
    first ask candidate if s/he knows java
  if s/he says 'yes' --> ask about selenium knowledge
    if s/he says 'yes' --> ask about API testing
      if s/he says 'yes' --> ask about SQL knowledge
       "Congrats! You are hired"
               if s/he says 'no' --> we need SQL knowledge
      if s/he says 'no' --> "We need API knowledge"
            if s/he says 'no' --> "We need selenium skills"
            if s/he says 'no' --> "please learn java and try again"
            /*

     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you know JAVA, yes/no?");
        String java = scanner.nextLine();
        if(java.equalsIgnoreCase("yes")){
            //yes for java
            System.out.println("do you know SElENIUM, yes/no?");
            String selenium = scanner.nextLine();
            if(selenium.equalsIgnoreCase("yes")){
                //yes for selenium
                System.out.println("do you know API, yes/no?");
                String api = scanner.nextLine();
                if(api.equalsIgnoreCase("yes")){
                    //yes for api
                    System.out.println("do you know SQL, yes/no?");
                    String sql = scanner.nextLine();
                    if(sql.equalsIgnoreCase("yes")) {
                        //yes for sql
                        System.out.println("Congrats! You are hired");
                    }else {
                    //no for sql
                        System.out.println("We need SQL knowledge");
                    }
                }else {
                    //no for api
                    System.out.println("We need API knowledge");
                }
            }else {
                //no for selenium
                System.out.println("We need selenium skills");
            }
        }else {
            //no for java
            System.out.println("Please learn java and try again");
        }






    }
}