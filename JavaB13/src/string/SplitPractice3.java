package string;

public class SplitPractice3 {
    public static void main(String[] args) {
        String paragraph = "Today is Saturday. This is a very nice day to study.! I am learning split method. " +
                "It returns String array. I want to solve this question by myself.! That would make me very happy";
        //print each sentence once
        String[] sentences = paragraph.split("\\. ");  // String[] sentences = paragraph.split("\\. ",3);
        for (String sentence : sentences) {
            System.out.println(sentence.trim());
        }
        System.out.println("================");
        String[] sentences1 = paragraph.split("!");
        for (String sentence : sentences1) {
            System.out.println(sentence.trim());
        }
        //06.18.2022--> print out true if the day is 18th of june
        String date = "06.18.2022";
        String[] partOfDate = date.split("\\.");

            if (partOfDate[0].equalsIgnoreCase("06") && partOfDate[1].equalsIgnoreCase("18")) {
                System.out.println("happy Birthday!!!");
            }
    }
}
