package ifStatement;

public class NestedPractice2 {
    public static void main(String[] args) {
        /*
        weekdays --> efe
        weekend --> yusuf
         */
        String option = "xxxx";
        String day = "MN";
        if (option.equalsIgnoreCase("weekday")){
            //efe --> Tue, Wed
            if (day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("wednesday")){
                System.out.println("Efe is available");

            } else {
                System.out.println("Efe is not available");
            }
        } else {
            System.out.println("this is weekend and instructor is Yusuf");

            //Yusuf

        }

    }
}
