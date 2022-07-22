import org.w3c.dom.css.Counter;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        String answer1 = scan.nextLine();

        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        String answer2 = scan.nextLine();

        System.out.println("\n3. What is rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB Negative\n");
        String answer3 = scan.nextLine();

        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron \n\tb) Hermoine\n\tc) Darco\n\t");
        String answer4 = scan.nextLine();
        scan.close();
        int score= 0;

        if (answer1.equals("c")){
            score+=5;
        }

        if (answer2.equals("a")) {
            score+=5;
        }

        if (answer3.equals("d")) {
            score+=5;
        }

        if (answer4.equals("a") || answer4.equals("b")) {
            score+=5;
        }
        //Task2 Check each answer- for each correct answer

        System.out.println("Your final score is : " + score);

        if (score>= 15) {
            System.out.println("Wow, you know your stuff");
        }

        if ((score<=15) && (score>=5)){
            System.out.println("Not bad!");
        }

        if (score<5){
            System.out.println("better luck next time");
        }
    }
}
