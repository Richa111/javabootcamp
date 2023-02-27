package section5.WithArrays;


public class RandomNumbers {
    public static void main(String[] args) {
        int[][] array = {
                {48, 56, 56, 76, 0, 81, 51, 81, 99, 70},
                {38, 52, 73, 6, 10, 56, 1, 71, 47, 9},
                {85, 35, 47, 98, 91, 25, 69, 52, 2, 93}
        };
            randomNumber();
            //print2DArray(int[][]);
        }
    private static int randomNumber() {
        double randomNumber = Math.random()*100;
        return (int)randomNumber;
    }
    private static void print2DArray(int[][] array) {
        //for (int i =0; i< array.length,)
        //System.out.print(array[i][j] + " ");
    }
}

