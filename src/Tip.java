public class Tip {
    public static void main(String[] args) {

        //Task1 function called tipthewaiter
        System.out.println("Waiter: I hope you enjoyed your meal!");
        System.out.println("Thank you!");
        tipTheWaiter(53.5);

    }
    public static void tipTheWaiter(double bill){
        double tip = 0.15*bill;
        System.out.println("your service was wonderful! Please, accept this tip: " +tip);

    }

}
