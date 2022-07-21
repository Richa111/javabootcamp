import java.util.Scanner;

public class JavaGram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your first name?");
        String name1 = scan.nextLine();

        System.out.println("What is your last name?");
        String lastname = scan.nextLine();

        System.out.println("How old are you?");
        int age1 = scan.nextInt();

        System.out.println("Make a username");
        scan.nextLine();
        String username =scan.nextLine();


        System.out.println("What city do you live in");
        String city = scan.nextLine();

        System.out.println("What country is that");
        String country = scan.nextLine();

        System.out.println("Thank you for joining Javagram ");
        System.out.println("\nHere is the information you entered:");
        System.out.println("First name: " + name1);
        System.out.println("Last name: " + lastname);
        System.out.println("Age: " + age1 );
        System.out.println("Username:"+ username);
        System.out.println("City: " + city);
        System.out.println("County:" + country);

    }

}
