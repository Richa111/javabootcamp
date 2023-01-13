package section5.WithArrays;

public class Arrays {
    //6.1
    public static void main(String[] args) {
        String seats[] ={"Harry","Neville","Ron","Hermoine","Seamus"};
        System.out.println("It's time to take your fifth year exams. Please, take your seats");
        for (int i=0; i<seats.length; i++){
            System.out.println(seats[i] + " you will take seat " +i);
        }
    }
}
