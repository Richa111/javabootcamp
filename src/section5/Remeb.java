package section5;

import static java.lang.Math.random;

public class Remeb {
    public static void main(String[] args) {
        int first =drawRandomCard();
        int total = first;
        System.out.println(total);

        System.out.println(choice(first));
    }

    public static int drawRandomCard() {
        double randomNumber = random() * 2;
        randomNumber += 1;
        return (int)randomNumber;
    }


    private static String choice(int value){
    ;
     //This will give you value 0, 1 and 2
        switch (value) {
        case 1:
            return  "   _____\n"+
                    "  |A _  |\n"+
                    "  | ( ) |\n"+
                    "  |(_'_)|\n"+
                    "  |  |  |\n"+
                    "  |____V|\n";
            case 2:
                return  "   _____\n"+
                        "  |2    |\n"+
                        "  |  o  |\n"+
                        "  |     |\n"+
                        "  |  o  |\n"+
                        "  |____Z|\n";

        default: return "impossible"; //impossible

        }

    }
}
