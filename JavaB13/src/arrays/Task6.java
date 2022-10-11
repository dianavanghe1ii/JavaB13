package arrays;

public class Task6 {
    public static void main(String[] args) {
        /*
        {"Monday", "Tuesday", "Wednesday", ... }
        yadnoM, YadseuT,...
         */
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String str = "Monday";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
        reverse += str.charAt(i);

    }
        System.out.println(reverse);

        System.out.println("===============");
        //store reversed string into array
        String [] reversedDays= new String[weekDays.length];
        int index =0;
        for (String day:weekDays){
            String reverse1=" ";
            for (int i = day.length() - 1; i >= 0; i--) {
                reverse1 += day.charAt(i);

            }
            System.out.println(reverse1);
            reversedDays[index]= reverse1;
            index++;

        }
        System.out.println(reversedDays);
    }
}
