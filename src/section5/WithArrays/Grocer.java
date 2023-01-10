package section5.WithArrays;

public class Ice {
    public static void main(String[] args) {

        String[] things = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("\nDo you sell coffee?");
        for (int i = 0; i < things.length; i++) {
            if (things[i].equals("coffee")) {
                System.out.println("We have that in aisle " +i);
            }
        }
    }
}
