public class scope {
    static int apples = 5;
    public static void main(String[] args) {
        someFunctions();
        System.out.println(apples);
    }
    public static void someFunctions(){
        System.out.println(apples);


    }
}
