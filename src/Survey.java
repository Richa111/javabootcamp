import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome.");

        int counter= 0;
        System.out.println("what is your name?");
        String name = scan.nextLine();
        counter++;
        System.out.println("How much money you have?");
        double amount = scan.nextDouble();
        counter++;

        System.out.println("Thank you for answering " + counter + " questions " + name );
    }
}
