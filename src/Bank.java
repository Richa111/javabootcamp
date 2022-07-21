import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("\"Are you here to get a mortgage? (yes or no)");
        String decision = scan.nextLine();

        if (decision.equals("yes")){
            System.out.println("\nHow many years have you worked for?");
            int numberOfYears = scan.nextInt();

        System.out.println("\nGreat! In one line" +
                "\nHow much money do you have in your savings?" +
                "\nAnd, how much do you owe in credit card debt?");
        int savings = scan.nextInt();
        int debt = scan.nextInt();


         if (savings >= 10000 && debt <= 5000 && numberOfYears >= 2) {
             System.out.println("What is your name?");
             scan.nextLine();
             String name = scan.nextLine();

             System.out.println("Congratulations " + name + ", you have been approved!");
         }
            if (decision.equals("yes") && savings <= 10000 && debt >= 5000 && numberOfYears != 2) {
                System.out.println("Sorry, you are not eligible for a mortgage.");
            }
        } else if (!decision.equals("yes")) {
            System.out.println("\nOK. Have a nice day!");

        }
        scan.close();
    }

}



