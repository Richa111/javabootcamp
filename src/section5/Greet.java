package section5;

import java.util.Scanner;

public class Greet {

    public static void main(String[] args) {
        String greet = greeting();

    }

    public static String greeting(){
        String greeting = " ";
        Scanner scan = new Scanner(System.in);
        while (!greeting.equals("Hi")){
            greeting = scan.nextLine();
        }
        return greeting;
    }
}
