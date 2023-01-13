package section5.WithArrays;
import java.util.Arrays;

public class Aisles {
    public static void main(String[] args) {

        String [] aisles = {"Espresspo","Iced coffee","Latte"};
        //System.out.println("Do you sell coffee?");
        //aisles[5] = "strawberry";
        //System.out.println(Arrays.toString(aisles));

        String [] newAisles = new String[5];
        for (int i=0 ; i< aisles.length; i++ ){
            newAisles[i] = aisles[i];

        }

        newAisles[3] = "House blend";
        newAisles[4] = "Dark Roast";
        //System.out.println(Arrays.toString(newAisles));

        //Quiz

        String[] items = {"clock", "table", "ladder", "chair", "Oven", "phone"};
        String[] moreItems = new String[6];
        System.out.println(Arrays.toString(moreItems));
        System.out.println(moreItems.length-1);

        for (int i =(moreItems.length-1); i>=1; i--){
            if (i%2==0){
                moreItems[i] =items[i];
                System.out.println(Arrays.toString(moreItems));
            }
        }
        System.out.println(Arrays.toString(moreItems));

        //System.out.println(Arrays.toString(aisles));
        //for (int i=0 ; i<6; i++ ){
        //    System.out.println(aisles[i]);
        //}

                //for (int i=0 ; i<6; i++ ){
        //    if (int i)) {
        //        System.out.print( "We have that in aisle "+ i);
            }
        }


