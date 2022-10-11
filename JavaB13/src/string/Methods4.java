package string;

public class Methods4 {
    public static void main(String[] args) {

        String item = "!!!!!!!!!!!!!!!!!!microphone";
        // substring(); returns string(it will return partial string given index)
        String part1 = item.substring(5);
        System.out.println(part1);
        // how to cut/take part of the string in the middle section not all the way to the end
        String part2 = item.substring(0, 5);
        System.out.println(part2);
        // take phone from the string 'microphone' but provide the index number dynamically
        System.out.println(item.substring(item.indexOf("ph")));

        // contain(); returns boolean
       boolean result =  item.contains("mic");
        System.out.println(result);
        // "!!!!!!!!!!!!!!!!!!microphone"
        System.out.println(item.contains("Phone")); // false because of the Uppercase 'P'

        System.out.println( item.contains("!!!!!!!!!!!!!!!!!!microphone")); // true
        System.out.println(item.contains("c"));

        //trim(); --> it will delete heading and trailing spaces
        String day = " Sunday is a good day to learn ";
        System.out.println(day);
        String day5 = day.trim(); /// or just (day = day.trim();
        System.out.println(day5);










    }
}
