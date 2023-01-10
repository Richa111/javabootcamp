package section5.Array;

public class ArraysAndLoops {
    public static void main(String[] args) {
        String [] chars = {"a","b","c", "d", "e", "f"};
        System.out.println("The length of chars " + chars.length);
        for (int i=0 ; i<6; i++){
            System.out.println("The element at index " + i + " is " + chars[i]);
        }
    }
}
