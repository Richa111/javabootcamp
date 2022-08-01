import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are");
        Scanner scan = new Scanner(System.in);
        String ready = scan.nextLine();
        String computerChoice = computerChoice();

        if (ready.equals("yes")) {
            System.out.println("Great");
            System.out.println("rock -- paper -- scissors, shoot!");
            String choice1 = scan.nextLine();
            System.out.println("You chose: " + choice1);
            System.out.println("Computer chose: "+  computerChoice() );

        } else {
            System.out.println("Darn, some other time...!");

        }
                scan.close();
    }
    private static String computerChoice() {
        // Generate random number between 0 to 3
        //random number function return value between 0.1 and 0.9
        Random rand = new Random();
        int value = rand.nextInt(3); //This will give you value 0, 1 and 2
        switch (value) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissor";
            default: return ""; //impossible
        }
    }
}

