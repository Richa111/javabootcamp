package section5.WithArrays;
import java.util.Arrays;

public class Weather {
    public static void main(String[] args) {
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahranheit = celciusToFahrenheit(celsius);
        System.out.println(Arrays.toString(celsius));
        System.out.println(Arrays.toString(fahranheit));
    }
    private static double[] celciusToFahrenheit(double[] celciusArray) {
        double[] fahrenheitArray = new double[celciusArray.length];
        for (int i = 0; i < celciusArray.length; i++) {
            double celcius = celciusArray[i];
            double fahranheit = ((celcius/5)*9)+32;
            fahrenheitArray[i] = fahranheit;


        }
        return fahrenheitArray;
    }
}