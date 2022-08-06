package section5;

import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        System.out.println("I hear you like to count by threes");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

        Scanner scan =  new Scanner(System.in);
        System.out.print("Pick a number to count by: ");
        int number1 = scan.nextInt();
        System.out.print("Pick a number to start counting from: ");
        int number2= scan.nextInt();
        System.out.print("Pick a number to count to: ");
        int number3 = scan.nextInt();

        for (int i= number2; i<=number3; i+=number1  ){
            System.out.print(i+ " ");
        }


    }
}
