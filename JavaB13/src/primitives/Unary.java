package primitives;

public class Unary {
    public static void main(String[] args) {
         int flower = 7;
        System.out.println(flower);
        flower++;
        System.out.println(flower);
        flower--;
        System.out.println(flower);
        flower--;
        flower--;
        flower--;
        flower++;
        System.out.println(flower);
        System.out.println("==============");

        int item = 6;
        int count = item-- + item--;
        System.out.println(count); //11
        System.out.println(item);
        System.out.println("============");
        int num = 3;
        System.out.println(num++); // >> shows 3 but behind scene num = 4
        System.out.println(num); //4
        System.out.println(++num); // shows 5; num = 5
        System.out.println(num); // 5
        ++num;
        System.out.println(num); //6
        --num;
        System.out.println(num); //5

        --num;
        System.out.println(--num);// 3

    }
}
