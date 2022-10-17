package section5;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        Scanner scan = new Scanner(System.in);


        int guess = 0;
        while (guess != 4) {
            guess = scan.nextInt();
            System.out.println("Guess again: " + guess);
        }
        System.out.println("you got it");
    }
}
