public class Parameters {
    public static void main(String[] args) {
        double measure1= measureRectangle(2.2, 2.4, "area");
        double measure2 = measureRectangle(2.3,4.3, "perimeter");




        //Parameters are the values function expects to receive
    }
        public static double measureRectangle(double len, double width, String option) {
            switch (option) {
                case "area":
                    return len * width;
                case "perimeter":
                    return 2 * (len + width);
                default:
                    return 404;

            }
        }

        public static void stringPrinter(double len, double width, double area, String option) {
            switch (option) {
                case "area":
                    if (len < 0 || width < 0) {
                        System.out.println("length or width cannot be negative");
                    }
                    else System.out.println(area);
            }
        }
}
