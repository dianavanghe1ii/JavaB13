package primitives;

public class ComparisonOperators3 {
    public static void main(String[] args) {

       /*
       even, if the child age is less than 7, they can attend
        */
        int kAge = 1;
        int requiredAge = 7;
        boolean canattend = kAge < requiredAge;
        System.out.println("Can the child attend? " + canattend);
        /*
       even, if the child age is greater than 7, they can attend
        */
        boolean canattend1 = kAge>requiredAge;
        System.out.println("Can the child attend? " + canattend1);
        /*
        there is a picnic and only kids that are at age 14 can attend
         */
        requiredAge =14;
        boolean canattend2 = kAge == requiredAge;
        System.out.println("Is the child's age 14? " + canattend2);

        /*
        there is a party , they are not taking people to the party if their age is 18
         */
        requiredAge =18;
        boolean canattend3 = kAge !=requiredAge;
        System.out.println("Can Attend? " + canattend3);

            }

}
