package section5.WithArrays;

public class ExamRevisited {
    //6.2
    public static void main(String[] args) {
            String seats[] ={"Malfoy","Crabbe","Goyle","Pansy","Dean"};
            System.out.println("It's time to take your fifth year exams. Please, take your seats");
            for (int i=0; i<seats.length; i++){
                System.out.println(seats[i] + ", you will take seat " +i);
            }
        }
    }

