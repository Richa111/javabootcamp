public class ReturnValues {
    public static void main(String[] args) {
        double measure1= measureRectangle(2.2, 2.4);
        double measure2= measureRectangle(2.1, 2.4);
        double measure3= measureRectangle(2.4, 2.4);
        double measure4=measureRectangle(2.7, 2.4);
        //Parameters are the values function expects to receive

        System.out.println("The area of the rectangle with the lenth of 2.2 and width of 2.4 is  " + measure1);
    }
    public static double measureRectangle(double len, double width){
        //Arguments are the values being passed in
        double area = len*width;
        return area;

    }

}

