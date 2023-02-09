package section5.WithArrays;
import java.util.Arrays;

public class LotteryTickets {
    public static void main(String[] args) {
        int[] ticket = {34, 43, 45, 65, 21, 54};
        int[] ticket2 = Arrays.copyOf(ticket, 6);
        ticket2 [2] = 54;
        //System.out.println(Arrays.toString(ticket));
        //System.out.println(Arrays.toString(ticket2));
        printTicketNumbers(ticket, ticket2);
        }
    private static void printTicketNumbers(int[] ticket, int[] ticket2) {
        System.out.print("Ticket 1 numbers: ");
        for (int i =0; i<ticket.length; i++)
            System.out.print(ticket[i] + " ");
            System.out.print("\n\n");

        System.out.print("Ticket 2 numbers: ");
        for (int i =0; i<ticket2.length; i++)
            System.out.print(ticket2[i] + " ");
            System.out.print("\n");
    }
}
