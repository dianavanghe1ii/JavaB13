package Project3;

import java.util.Scanner;

public class MusicBox {
    public static void main(String[] args) {
        int classicalSongCost = 2;
        int countrySongCost = 3;
        int popSongCost = 4;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of music you want to listen to? Choose from: \n 1 - Classical \n 2 - Pop \n 3 - Country");
        int musicTypes = scanner.nextInt();
        switch (musicTypes){
            case 1 :
                System.out.println("Which classical song you would like to listen to? \n Four Seasons  \n Fur Elise \n Vocalise \n The planets ");
                scanner = new Scanner(System.in);
                String songName = scanner.nextLine().toUpperCase();
                        switch (songName){
                            case "Four Seasons" :
                                System.out.println("Please pay $2 to listen to this song");
                                scanner = new Scanner(System.in);
                                int songPrice = scanner.nextInt();
                                if(songPrice==classicalSongCost){
                                    System.out.println("Four Seasons is playing");
                                } else if (songPrice<classicalSongCost){
                                    System.out.println("ENTEREDPRICE is not enough, please try later ");

                                }else {
                                    System.out.println("You have entered " + (songPrice-classicalSongCost) + " dollar more");
                                }
                        }break;


        }


    }
}
