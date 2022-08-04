import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are");
        Scanner scan = new Scanner(System.in);
        String ready = scan.nextLine();


        if (ready.equals("yes")) {
            System.out.println("Great");
            System.out.println("rock -- paper -- scissors, shoot!");
            String yourChoice = scan.next();
            String computerChoice = computerChoice();
            String result = result(yourChoice, computerChoice);
            printResult(yourChoice, computerChoice, result);
        } else {
            System.out.println("Darn, some other time...!");

        }
        scan.close();
    }
    public static String result(String yourChoice, String computerChoice){
            String result = "";

        if (yourChoice.equals("rock") && computerChoice.equals("scissors")) {
            result = "You win!";
        } else if (yourChoice.equals("rock") && computerChoice.equals("paper")) {
            result = "You lose!";
        } else if (yourChoice.equals("paper") && computerChoice.equals("rock")) {
            result = "You win!";
        } else if (yourChoice.equals("paper") && computerChoice.equals("scissors")) {
            result = "You lose!";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("paper")) {
            result = "You win!";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("rock")) {
            result = "You lose!";
        } else if (yourChoice.equals(computerChoice)) {
            result = "It's a tie!";
        }
        return result;
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
                return "scissors";
            default: return ""; //impossible
        }
    }

    public static void printResult(String yourChoice, String computerChoice, String result){
        System.out.println("You chose: " + yourChoice);
        System.out.println("Computer chose: "+  computerChoice );
        System.out.println(result);

    }
}

