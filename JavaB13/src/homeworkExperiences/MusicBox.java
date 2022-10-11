package homeworkExperiences;

import java.util.Scanner;

public class MusicBox {
    public static void main(String[] args) {
        int classicalSongCost = 2;
        int countrySongCost = 3;
        int popSongCost = 4;


        Scanner scanner = new Scanner(System.in);
        int classicalCost = 2, countryCost = 3, popCost = 4;

        System.out.println("Please chose music type : \n 1 - Classical \n 2 - Pop \n 3 - Country");
        int typeOfMusic = scanner.nextInt();
        switch (typeOfMusic) {
            case 1:
                System.out.println("What song of Classical music you would like to listen :\n1- Four Seasons \n2- Fur Elise \n3- Finlandia \n4 Vocalise \n5-The Planets ");
                scanner = new Scanner(System.in);
                String classicSongName = scanner.nextLine().toUpperCase();
                switch (classicSongName) {
                    case "FOUR SEASONS":
                        System.out.println("Please pay 2$");
                        scanner = new Scanner(System.in);
                        int moneyClassic = scanner.nextInt();
                        if (moneyClassic == classicalCost) {
                            System.out.println("FOUR SEASONS" + " is playing");
                        } else if (moneyClassic < classicalCost) {
                            System.out.println(moneyClassic + " is not enough, please try later ");

                        } else {
                            System.out.println(" you entered " + (moneyClassic - classicalCost) + "dollar more");
                        }
                        break;
                    case "FUR ELISE":
                        System.out.println("Please pay 2$");
                        int moneyClassic1 = scanner.nextInt();
                        if (moneyClassic1 == classicalCost) {
                            System.out.println("FUR ELISE" + " is playing");
                        } else if (moneyClassic1 < classicalCost) {
                            System.out.println(moneyClassic1 + " is not enough, please try later ");

                        } else {
                            System.out.println(" you entered " + (moneyClassic1 - classicalCost) + "dollar more");
                        }
                        break;
                    case "FINLANDIA":
                        System.out.println("Please pay 2$");
                        scanner = new Scanner(System.in);
                        int moneyClassic2 = scanner.nextInt();
                        if (moneyClassic2 == classicalCost) {
                            System.out.println("FINLANDIA" + " is playing");
                        } else if (moneyClassic2 < classicalCost) {
                            System.out.println(moneyClassic2 + " is not enough, please try later ");

                        } else {
                            System.out.println(" you entered " + (moneyClassic2 - classicalCost) + "dollar more");
                        }
                        break;
                    case "VOCALISE":
                        System.out.println("Please pay 2$");
                        int moneyClassic3 = scanner.nextInt();
                        if (moneyClassic3 == classicalCost) {
                            System.out.println("VOCALISE" + " is playing");
                        } else if (moneyClassic3 < classicalCost) {
                            System.out.println(moneyClassic3 + " is not enough, please try later ");

                        } else {
                            System.out.println(" you entered " + (moneyClassic3 - classicalCost) + "dollar more");
                        }
                        break;
                    case "THE PLANETS":
                        System.out.println("Please pay 2$");
                        int moneyClassic4 = scanner.nextInt();
                        if (moneyClassic4 == classicalCost) {
                            System.out.println("THE PLANETS" + " is playing");
                        } else if (moneyClassic4 < classicalCost) {
                            System.out.println(moneyClassic4 + " is not enough, please try later ");

                        } else {
                            System.out.println(" you entered " + (moneyClassic4 - classicalCost) + "dollar more");
                        }
                        break;

                    default:
                        System.out.println("Name of song is not available");
                        break;


                }
                break;
            case 2:
                System.out.println("What song of Pop music you would like to listen :\n1- Bad Guy \n2- Talk \n3- Please Me \n4 7 Ring \n5-Without Me ");
                scanner = new Scanner(System.in);
                String popSongName = scanner.nextLine().toUpperCase();
                switch (popSongName) {
                    case "BAD GUY":
                        System.out.println("Please pay 4$");
                        scanner = new Scanner(System.in);
                        int moneyPop = scanner.nextInt();
                        if (moneyPop == popCost) {
                            System.out.println("BAD GUY" + " is playing. Enjoy the song!");
                        } else if (moneyPop < popCost) {
                            System.out.println(moneyPop + " is not enough, please try later ");

                        } else {
                            System.out.println(" you entered " + (moneyPop - popCost) + " dollar more");
                        }
                        break;
                    case "TALK":
                        System.out.println("Please pay 4$");
                        scanner = new Scanner(System.in);
                        int moneyPop2 = scanner.nextInt();
                        if (moneyPop2 == popCost) {
                            System.out.println("TALK" + " is playing. Enjoy the song!");
                        } else if (moneyPop2 < popCost) {
                            System.out.println(moneyPop2 + " is not enough, please try later ");

                        } else {
                            System.out.println(" you entered " + (moneyPop2 - popCost) + " dollar more");
                        }
                        break;
                    case "PLEASE ME":
                        System.out.println("Please pay 4$");
                        scanner = new Scanner(System.in);
                        int moneyPop3 = scanner.nextInt();
                        if (moneyPop3 == popCost) {
                            System.out.println("PLEASE ME" + " is playing. Enjoy the song!");
                        } else if (moneyPop3 < popCost) {
                            System.out.println(moneyPop3 + " is not enough, please try later ");

                        } else {
                            System.out.println(" you entered " + (moneyPop3 - popCost) + " dollar more");
                        }
                        break;
                    case "7 RING":
                        System.out.println("Please pay 4$");
                        scanner = new Scanner(System.in);
                        int moneyPop4 = scanner.nextInt();
                        if (moneyPop4 == popCost) {
                            System.out.println("7 RING" + " is playing. Enjoy the song!");
                        } else if (moneyPop4 < popCost) {
                            System.out.println(moneyPop4 + " is not enough, please try later ");

                        } else {
                            System.out.println(" you entered " + (moneyPop4 - popCost) + " dollar more");
                        }
                        break;
                    case "WITHOUT ME":
                        System.out.println("Please pay 4$");
                        scanner = new Scanner(System.in);
                        int moneyPop5 = scanner.nextInt();
                        if (moneyPop5 == popCost) {
                            System.out.println("WITHOUT ME" + " is playing. Enjoy the song!");
                        } else if (moneyPop5 < popCost) {
                            System.out.println(moneyPop5 + " is not enough, please try later ");

                        } else {
                            System.out.println(" you entered " + (moneyPop5 - popCost) + " dollar more");
                        }
                        break;
                    default:
                        System.out.println("Name of song is not available");
                        break;



                        }break;
            case 3:
                System.out.println("What song of Country music you would like to listen :\n1- Meant To Be \n2- Heaven \n3- Simple \n4 One Number Away \n5-Get Along ");
                scanner = new Scanner(System.in);
                String countrySongName = scanner.nextLine().toUpperCase();
                switch (countrySongName) {
                    case "MEANT TO BE":
                        System.out.println("Please pay 3$");
                        scanner = new Scanner(System.in);
                        int countryClassic = scanner.nextInt();
                        if (countryClassic == countryCost) {
                            System.out.println("MEANT TO BE" + " is playing");
                        } else if (countryClassic < countryCost) {
                            System.out.println(countryClassic + " is not enough, please try later ");

                        } else {
                            System.out.println(" you entered " + (countryClassic - countryCost) + " dollar more");
                        }
                        break;
                    case "HEAVEN":
                        System.out.println("Please pay 3$");
                        scanner = new Scanner(System.in);
                        int countryClassic2 = scanner.nextInt();
                        if (countryClassic2 == countryCost) {
                            System.out.println("HEAVEN" + " is playing");
                        } else if (countryClassic2 < countryCost) {
                            System.out.println(countryClassic2 + " is not enough, please try later ");

                        } else {
                            System.out.println(" you entered " + (countryClassic2 - countryCost) + " dollar more");
                        }
                        break;
                    case "SIMPLE":
                        System.out.println("Please pay 3$");
                        scanner = new Scanner(System.in);
                        int countryClassic3 = scanner.nextInt();
                        if (countryClassic3 == countryCost) {
                            System.out.println("SIMPLE" + " is playing");
                        } else if (countryClassic3 < countryCost) {
                            System.out.println(countryClassic3 + " is not enough, please try later ");

                        } else {
                            System.out.println(" you entered " + (countryClassic3 - countryCost) + " dollar more");
                        }
                        break;
                    case "ONE NUMBER AWAY":
                        System.out.println("Please pay 3$");
                        scanner = new Scanner(System.in);
                        int countryClassic4 = scanner.nextInt();
                        if (countryClassic4 == countryCost) {
                            System.out.println("ONE NUMBER AWAY" + " is playing");
                        } else if (countryClassic4 < countryCost) {
                            System.out.println(countryClassic4 + " is not enough, please try later ");

                        } else {
                            System.out.println(" you entered " + (countryClassic4 - countryCost) + " dollar more");
                        }
                        break;
                    case "GET ALONG":
                        System.out.println("Please pay 3$");
                        scanner = new Scanner(System.in);
                        int countryClassic5 = scanner.nextInt();
                        if (countryClassic5 == countryCost) {
                            System.out.println("GET ALONG" + " is playing");
                        } else if (countryClassic5 < countryCost) {
                            System.out.println(countryClassic5 + " is not enough, please try later ");

                        } else {
                            System.out.println(" you entered " + (countryClassic5 - countryCost) + " dollar more");
                        }default:
                        System.out.println("Name of song is not available");
                        break;



                }break;

                    default:
                        System.out.println("TYPE OF MUSIC is not available");
                        break;

                }
        }
    }



