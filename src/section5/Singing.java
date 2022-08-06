package section5;

public class Singing {

    public static void main(String[] args) {
        sing();
    }

    public static void sing() {
        int i;
        for (i = 99; i >= 1; )
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer!"+"\ntake one down, pass it around " + --i + " bottles of beer on the wall!");

    }
}

