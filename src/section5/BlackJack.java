package section5;

import java.util.Scanner;

import static java.lang.Math.*;

public class BlackJack {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        scan.nextLine();
        int firstCard = drawRandomCard();
        int secondCard = drawRandomCard();
        System.out.println("\n You get a \n" + cardString(firstCard) + "\n and a \n" + cardString(secondCard));
        int total = min(firstCard, 10) + min(secondCard, 10);
        System.out.println("your total is: " + total);

        //System.out.println(firstCard);
        //System.out.println("and");
        //System.out.println(secondCard);
        int dealerCard1 = drawRandomCard();
        int dealerCard2 = drawRandomCard();
        int dealerTotal = min(dealerCard1, 10) + min(dealerCard2, 10);

        System.out.println("The dealer shows" + "\n" + cardString(dealerCard1) + "\n and a" + "\n" + faceDown());
        System.out.println("\nThe dealer total is hidden");


        while (true) {
            String response = hitOrStay();
            if (response.equalsIgnoreCase("stay")) {
                System.out.println("Dealer's turn");
                System.out.println("\n Dealer get a \n" + cardString(dealerCard1) + "\n and a \n" + cardString(dealerCard2));
                while (dealerTotal < 17) {
                    int dealerNewCard = drawRandomCard();
                    dealerTotal += Math.min(dealerNewCard, 10);
                    System.out.println("\n Dealer get a \n" + cardString(dealerNewCard));
                    System.out.println("Dealer total is: " + dealerTotal);
                    if (dealerTotal > 21) {
                        System.out.println("\nBust! Dealer loses");
                        System.exit(0);
                    }
                    if (dealerTotal >= 17) {
                        System.out.println("\nDealer turns end");
                    }
                }
                if (total > dealerTotal) {
                    System.out.println("Player wins");
                } else {
                    System.out.println("Dealer wins");
                }
                System.exit(0);

            } else {
                int newcard = drawRandomCard();
                total += Math.min(newcard, 10);
                System.out.println("\n You get a \n" + cardString(newcard));
                System.out.println("your total is: " + total);
                if (total > 21) {
                    System.out.println("\nBust! Player loses");
                    System.exit(0);
                }

            }
        }

    }

    /**
     * Function name -- drawRandomCard
     *
     * @return (int)
     * <p>
     * Inside the function:
     * 1. Gets a random number between 1 and 13.
     * 2. Returns a card.
     * <p>
     * <p>
     * if (total>dealerTotal){
     * System.out.println("Player wins");
     * }
     * else {
     * System.out.println("Dealer wins");
     * }
     * System.exit(0);
     */
    public static int drawRandomCard() {
        double randomNumber = random() * 13;
        randomNumber += 1;
        return (int) randomNumber;
    }

    public static String cardString(int cardNumber) {
        switch (cardNumber) {
            case 1:
                return "   _____\n" +
                        "  |A _  |\n" +
                        "  | ( ) |\n" +
                        "  |(_'_)|\n" +
                        "  |  |  |\n" +
                        "  |____V|\n";
            case 2:
                return "   _____\n" +
                        "  |2    |\n" +
                        "  |  o  |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____Z|\n";

            case 3:
                return "   _____\n" +
                        "  |3    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____E|\n";

            case 4:
                return "   _____\n" +
                        "  |4    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  | o o |\n" +
                        "  |____h|\n";

            case 5:
                return "   _____ \n" +
                        "  |5    |\n" +
                        "  | o o |\n" +
                        "  |  o  |\n" +
                        "  | o o |\n" +
                        "  |____S|\n";

            case 6:
                return "   _____ \n" +
                        "  |6    |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  |____6|\n";

            case 7:
                return
                        "   _____ \n" +
                                "  |7    |\n" +
                                "  | o o |\n" +
                                "  |o o o|\n" +
                                "  | o o |\n" +
                                "  |____7|\n";


            case 8:
                return "   _____ \n" +
                        "  |8    |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  |____8|\n";
            case 9:
                return "   _____ \n" +
                        "  |9    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____9|\n";

            case 10:
                return "   _____ \n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___10|\n";
            case 11:
                return "   _____\n" +
                        "  |J  ww|\n" +
                        "  | o {)|\n" +
                        "  |o o% |\n" +
                        "  | | % |\n" +
                        "  |__%%[|\n";
            case 12:
                return "   _____\n" +
                        "  |Q  ww|\n" +
                        "  | o {(|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%O|\n";
            case 13:
                return "   _____\n" +
                        "  |K  WW|\n" +
                        "  | o {)|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%>|\n";

            default:
                return "not possible";
        }
    }

    public static String faceDown() {
        return "   _____\n" +
                "  |     |\n" +
                "  |  J  |\n" +
                "  | JJJ |\n" +
                "  |  J  |\n" +
                "  |_____|\n";

    }


    /**
     * Function name -- hitOrStay
     */

    private static String hitOrStay() {
        System.out.println("Would you like to hit or stay");
        String response = scan.nextLine();
        while (true) {
            if (response.equalsIgnoreCase("hit") || response.equalsIgnoreCase("stay")) {
                break;
            }
            response = scan.nextLine();
        }
        return response;
    }
}
/**
 * private static void play(){
 * String response = scan.nextLine();
 * boolean isRunning = true;
 * int playerHand = 0;
 * while (isRunning){
 * if (response.equalsIgnoreCase("hit")){
 * scan.nextLine();
 * int card = drawRandomCard();
 * System.out.println("\n You get a \n" + cardString(card));
 * playerHand = playerHand + card;
 * if (playerHand > 21) {
 * System.out.println("loss");
 * isRunning = false;
 * }
 * if (playerHand == 21) {
 * System.out.println("winner");
 * isRunning = false;
 * }
 * }
 * System.out.println(playerHand);
 * }
 * <p>
 * private static void play(){
 * String response = scan.nextLine();
 * int playerHand = 0;
 * while (true){
 * if (response.equalsIgnoreCase("hit")){
 * scan.nextLine();
 * int card = drawRandomCard();
 * System.out.println("\n You get a \n" + cardString(card));
 * <p>
 * <p>
 * }
 * }
 * <p>
 * }
 * <p>
 * }
 */





