public class DocComments {
    public static void main(String[] args) {

    }


    /**
     * Function name : printText
     *
     * @param name (String)
     * @param age  (String)
     *             <p>
     *             <p>
     *             Inside the function:
     *             1. prints the name and age as a part of the text
     */


    public static void printText(String name, String age) {
        System.out.println("Hi, I'm " + name + "and I'm " + age + "years old.");
    }

    /**
     *
     * @param length
     * @param width
     * @return
     */

    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }

}

/*
        switch (choice) {
            case "butterfly":
            case  "elephant":
            case"bear":
            case "snake":
 */