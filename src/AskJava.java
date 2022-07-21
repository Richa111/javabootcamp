public class AskJava {
    public static void main(String[] args) {
        System.out.println("Me: Hi Java, do I have enough change to buy chips?");
        double change = 3.50;
        double priceOfChip = 2.50;
        System.out.println( "Java: " +  (change >=priceOfChip) +"\n");

        System.out.println("Me: Hi Java, can the elevator hold everyone?");
        int totalPeople= 15;
        int maximum = 12;
        System.out.println( "Java: " +  (maximum>=totalPeople) +"\n");

        System.out.println( "Me: Hi Java, will my friend be happy?");
        String friendWant = "PS5";
        String youGave= "toy car";
        System.out.println("Java: " +  (friendWant.equals(youGave)) +"\n");





    }
}
