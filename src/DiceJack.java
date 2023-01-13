import java.util.Scanner;

public class DiceJack {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Please choose three numbers");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();

        int sumOfNumber = (int) (number1 +number2 + number3);
        int sumOfDiceRolls = (int) (roll1 +roll2 +roll3);

        System.out.println("Dice sum = " + sumOfDiceRolls +"  Number sum =" + sumOfNumber);

        if (number1<1|| number2<1 || number3<1){
            System.out.println("Number cannot be less than 1. Shutting game down");
            System.exit(0);
        }

        if (number1>6|| number2>6 || number3>6){
            System.out.println("Number cannot be more than 6. Shutting game down");
            System.exit(0);
        }
    }
    private static int rollDice(){
        double randomNumber = Math.random()*6;
        randomNumber+=1;
        return (int)randomNumber;
    }

    public static void checkWin(int sumOfDiceRolls, int sumOfNumber){
        if ( sumOfNumber< sumOfDiceRolls && sumOfNumber - sumOfDiceRolls<3 ){
            System.out.println("User wins");
        }
        else {
            System.out.println("you lose");
        }
    }

}
