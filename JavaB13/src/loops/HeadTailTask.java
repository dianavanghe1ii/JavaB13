package loops;

import java.util.Random;
import java.util.Scanner;

public class HeadTailTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String yesNo;
        do {
            int number = random.nextInt(2);
            System.out.println("Game is started, Make a Guess! HEAD/TAIL");
            String userGuess = scanner.next();
            String flip = number == 0 ? "Head" : "Tail";

            if (userGuess.equalsIgnoreCase(flip)) {
                System.out.println("You are lucky, it is your day today.");
            } else
                System.out.println("Sorry, that was not the correct choice");


        System.out.println("Do you want to play again? Y?N");
        yesNo=scanner.next();
    }
    while( yesNo.equalsIgnoreCase("yes"));
        System.out.println("It's ok, see you Next time!");

    }
}
