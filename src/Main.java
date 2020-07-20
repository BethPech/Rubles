public class Main {
    public static void main(String[] args) {
        int account = 100;
        int refill = 2_155;
        int bonus = (account + refill) + (refill/100);
        int limit = 0;
        if (refill<=1_000) {
            bonus = limit;
        }
        System.out.println(bonus);

    }

}