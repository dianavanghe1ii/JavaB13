package string;

public class SplitPractice4 {
    public static void main(String[] args) {
        /*
            Watermelon (Citrullus lanatus) is a flowering plant species of the Cucurbitaceae family and the name of its edible fruit.
            A scrambling and trailing vine-like plant, it is a highly cultivated fruit worldwide, with more than 1,000 varieties.
            Watermelon is grown in favorable climates from tropical to temperate regions worldwide for its large edible fruit,
             which is a berry with a hard rind and no internal divisions, and is botanically called a pepo. The sweet, juicy flesh
              is usually deep red to pink, with many black seeds, although seedless varieties exist. The fruit can be eaten raw or
              pickled, and the rind is edible after cooking. It may also be consumed as a juice or as an ingredient in mixed beverages.
            Kordofan melons from Sudan are the closest relatives and may be progenitors of modern, cultivated watermelons.[2] Wild
            watermelon seeds were found in Uan Muhuggiag, a prehistoric site in Libya that dates to approximately 3500 BC.[3] Watermelons
            were domesticated in Egypt by 2000 BC, although they were not the sweet modern variety. Sweet dessert watermelons spread across
            the Mediterranean world during Roman times.[4]
            Considerable breeding effort has developed disease-resistant varieties. Many cultivars are available that produce mature
            fruit within 100 days of planting. In 2017, China produced about two-thirds of the world total of watermelon.
                     */

        //find and print out words that has odd number of letters
        // for example: a, lanatus, plant, the...
        String  text = "Watermelon (Citrullus lanatus) is a flowering plant species of the Cucurbitaceae family and the name of its edible fruit.\n" +
                "A scrambling and trailing vine-like plant, it is a highly cultivated fruit worldwide, with more than 1,000 varieties.\n" +
                "Watermelon is grown in favorable climates from tropical to temperate regions worldwide for its large edible fruit,\n" +
                "which is a berry with a hard rind and no internal divisions, and is botanically called a pepo. The sweet, juicy flesh\n" +
                "is usually deep red to pink, with many black seeds, although seedless varieties exist. The fruit can be eaten raw or\n" +
                "pickled, and the rind is edible after cooking. It may also be consumed as a juice or as an ingredient in mixed beverages.\n" +
                "Kordofan melons from Sudan are the closest relatives and may be progenitors of modern, cultivated watermelons.[2] Wild\n" +
                "watermelon seeds were found in Uan Muhuggiag, a prehistoric site in Libya that dates to approximately 3500 BC.[3] Watermelons\n" +
                "were domesticated in Egypt by 2000 BC, although they were not the sweet modern variety. Sweet dessert watermelons spread across\n" +
                "the Mediterranean world during Roman times.[4]\n" +
                "Considerable breeding effort has developed disease-resistant varieties. Many cultivars are available that produce mature\n" +
                "fruit within 100 days of planting. In 2017, China produced about two-thirds of the world total of watermelon.";

        //1. need to take every single word
        //2. store words in an array
        String[] words = text.split(" ");
        System.out.println(words);
        for (int i=0; i<text.length(); i++){
            if (Character.isAlphabetic(text.charAt(i))){
                text+=text.charAt(i);
            }
        }
        System.out.println(text);

    }
}
