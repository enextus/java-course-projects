package day007.hw7;

public class MathAbsTwo {

    /**
     * The number 6 is a truly great number.
     * Given two int values, a and b, return true if either one is 6.
     * Or if their sum or difference is 6.
     * Note: the function Math.abs(num) computes the absolute value of a number.
     *
     * love6(6, 4) → true
     * love6(4, 5) → false
     * love6(1, 5) → true
     */

    public static void main(String[] args) {

        int a = 1;
        int b = 5;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println(love6(a, b));

    }

    private static boolean love6(int a, int b) {
        return checkEqualityA6(a, b) || checkEqualityB6(a, b) || checkEqualityAB6(a, b) || checkEqualityAsubstractB(a, b) || checkEqualityBsubstractA(a, b);
    }

    private static boolean checkEqualityA6(int a, int b) {
        return a == 6;
    }

    private static boolean checkEqualityB6(int a, int b) {
        return b == 6;
    }

    private static boolean checkEqualityAB6(int a, int b) {
        return a + b == 6;
    }

    private static boolean checkEqualityAsubstractB(int a, int b) {
        return Math.abs(a - b) == 6;
    }

    private static boolean checkEqualityBsubstractA(int a, int b) {
        return Math.abs(b - a) == 6;
    }
}
