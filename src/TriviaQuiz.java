import java.util.Scanner;

public class TriviaQuiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String option = scan.nextLine();
        switch (option) {
            case "Question 1":
                System.out.println("1. Which country held the 2016 Summer Olympics?");
                System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");

            case "Question 2":

            case "Question 3":

            case "Question 4":



                System.out.println("1. Which country held the 2016 Summer Olympics?");
                System.out.println("1. Which country held the 2016 Summer Olympics?");
                System.out.println("1. Which country held the 2016 Summer Olympics?");
                System.out.println("1. Which country held the 2016 Summer Olympics?");
        }

        scan.close();
    }
}
