package section5.WithArrays;

public class Apples {
    public static void main(String[] args) {

        String [] apple = {"Gala", "Granny Smith", "Macintosh"};
        double [] price = {1.99, 1.49, 1.29};
        System.out.println("Here's your receipt");

        for (int i =0; i<apple.length; i++){
            System.out.println(apple[i]+": $"+price[i]);
        }

    }
}
