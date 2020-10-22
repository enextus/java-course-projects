package day010.hw10;

public class ТhreeТhousandIssue {

    /**
     * Given a number less than 3000.
     * When a number is divided by 32, the remainder is 30, and when divided by 58, the remainder is 44.
     * Find the number or numbers.
     */

    public static void main(String[] args) {
        int maxPossibleNumber = 3000;

        System.out.print("Founded numbers: ");

        for (int i = 1; i < maxPossibleNumber; i++) {
            if (searchForAnswer(i)) System.out.print(i + "; ");
        }

        // test evidence
        System.out.println("\nThe result evidenced by this test:");
        System.out.println("798 % 32 = " + (798 % 32)); // 30
        System.out.println("798 % 58 = " + (798 % 58)); // 44

        System.out.println("1726 % 32 = " + (1726 % 32)); // 30
        System.out.println("1726 % 58 = " + (1726 % 58)); // 44

        System.out.println("2654 % 32 = " + (2654 % 32)); // 30
        System.out.println("2654 % 58 = " + (2654 % 58)); // 44

    }

    private static boolean searchForAnswer(int n) {

        return (n % 58) == ((n % 32) + 14) && (n % 32) == 30;
    }
}
