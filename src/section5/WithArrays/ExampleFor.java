package section5.WithArrays;

import java.util.Arrays;

public class ExampleFor {
    //

    public static void main(String[] args) {
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(Arrays.toString(celsius));
        System.out.println(Arrays.toString(fahrenheit));
    }

    private static double[] celsiusToFahrenheit(double[] celsiusArray) {
        double[] fahrenheitArray = new double[celsiusArray.length];
        for (int i=0; i<celsiusArray.length; i++){
            double celsius =celsiusArray[i];
            double faranheit = ((celsius/5)*9)+32;
            fahrenheitArray[i] = faranheit;
        }
        return fahrenheitArray;


    }


}
