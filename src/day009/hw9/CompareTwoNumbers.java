package day009.hw9;

public class CompareTwoNumbers {
    /**
     * Given two integers, return the larger of two. If the numbers are equal, then return zero.
     * moreOrLess(5, 6) -> 6
     * moreOrLess(5, 5) -> 0
     * moreOrLess(0, 100) -> 100
     */

    public static void main(String[] args) {

        int firstInteger = 15;
        int secondInteger = 6;

        System.out.println("Given numbers: " + firstInteger + " and " + secondInteger + ".\n"
                + "Result: " + moreOrLessOne(firstInteger, secondInteger));

        System.out.println("Given numbers: " + firstInteger + " and " + secondInteger + ".\n"
                + "Result: " + moreOrLessTwo(firstInteger, secondInteger));

        System.out.println("Given numbers: " + firstInteger + " and " + secondInteger + ".\n"
                + "Result: " + moreOrLessThird(firstInteger, secondInteger));
    }

    private static int moreOrLessOne(int a, int b) {
        if (a == b) return 0;
        else if (a > b) return a;
        else return b;
    }

    private static int moreOrLessThird(int a, int b) { // optimized code
        if (a == b) return 0;
        else return Math.max(a, b);
    }

    private static int moreOrLessTwo(int a, int b) { // just for fun code ;)
        if (a > b) return a;
        else if (b > a) return b;
        else return 0;
    }
}
