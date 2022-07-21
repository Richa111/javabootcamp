public class Calender {
    public static void main(String[] args) {
        int day = 1;
        System.out.println("Hey, are you free on " + day + "? \n");
        System.out.println("Hmm, let me check my calendar.");

        switch (day){
            case 1: System.out.println("Sorry, I have to stay at work late."); break;
            case 2: System.out.println("It looks like I have meetings all day."); break;
            case 3: System.out.println("I have a dentist appointment. Some other time!"); break;
            case 4: System.out.println("Sorry, thursday is date night!"); break;
            case 5: System.out.println("I'm free!!"); break;
            case 6: System.out.println("I'm free!!"); break;
            case 7: System.out.println("I'm free!!"); break;
            default: System.out.println("that's not a day.");

        }
    }
        //String day = "friday"﻿;
        //System.out.﻿println﻿(﻿"Hey, are you free on " + day + "? \n"﻿)﻿;
        //System.out.﻿println﻿(﻿"Hmm, let me check my calendar."﻿)﻿;
}
