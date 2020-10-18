package day009;

public class HappyDumpling {
    public static void main(String[] args) {
        happyDumpling();
    }

    private static void happyDumpling() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Happy");
                break; // loop escape right now
            }
            System.out.println("loop step" + i);
        }
    }
}
