package section5.WithArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {
        System.out.println("How many pizza toppings do you want?");
        Scanner scan = new Scanner(System.in);
        int numberOfToppings = scan.nextInt();
        System.out.println("Great, enter each topping!");
        System.out.print("0. ");
        String firstTopping = scan.next();
        System.out.print("1. ");
        String secondTopping = scan.next();
        System.out.print("2. ");
        String thirdTopping = scan.next();

        String[] toppings = {firstTopping, secondTopping, thirdTopping};
        System.out.println("Thank you! Here are the toppings you ordered");

        for (int i=0; i < toppings.length; i++ ) {
            System.out.println(i+". " +toppings[i]);
        }


    }
}
