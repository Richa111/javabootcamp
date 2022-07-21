import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        String name2 = scan.nextLine();

        System.out.println("\nHi " + name2 + "! I'm Javabot. Where are you from?" );
        String place = scan.nextLine();

        System.out.println("\nI hear it's beautiful at " + place +"! I'm from a place called Oracle" );
        System.out.println("How old are you ?");
        int age2= scan.nextInt();

        System.out.println("\nSo you're "+ age2 +", cool! I'm 400 years old.");
        int age3 = 400/age2;
        System.out.println("This means I'm " + age3+ " times older than you.");

        System.out.println("Enough about me. What's your favourite language? (Just don't say Python)");
        scan.nextLine();
        String language = scan.nextLine();

        System.out.println("\n"+ language + ", that's great! Nice chatting with you" + name2 +". I have to log off now. See ya !");
        scan.close();
    }
}