package section5.WithArrays;

public class FightRecord {
    public static void main(String[] args) {
        String [] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};
        int wins = 0;
        for (int i = 0; i < record.length; i++){
            if (record [i].equals("WIN")){
                wins++;
            }
        }

        int loss = 0;
        for (int i = 0; i < record.length; i++){
            if (record [i].equals("LOSS")){
                loss++;
            }
        }

        System.out.println("With a professional record of " +wins+ " wins and "+ loss+ " losses.");
        System.out.println("He is the pride of oracle: Java Fury!");
    }
}
