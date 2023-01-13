package section5.WithArrays;

import java.util.Arrays;

public class RandomNumber {
    /**
     * Function name - randomNumber
     *
     * @return (int)
     * <p>
     * Inside the function
     * - returns a random number between 0 to 49999
     */

    public static void main(String[] args) {
        int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(),
                randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};
        //System.out.println(scores);
        int highScore = 0;
        for (int i =0; i< scores.length; i++){
            if (scores[i] >highScore){
                highScore = scores[i];
            }
        }
        System.out.println("\n\nHere are your scores: "+ highScore + ". Give that man a cookie!");
        //System.out.println("Here are your scores: " + Arrays.toString(scores));


    }
    private static int randomNumber() {
        double randomDouble = Math.random() * 50000;
        int randomInt = (int)randomDouble;
        return randomInt;
    }
}
