package day007.hw7;

public class MathAbs {

    /**
     * The number 6 is a truly great number.
     *
     * Given two int values, a and b, return true if either one is 6.
     * Or if their sum or difference is 6.
     *
     * Note: the function Math.abs(num) computes the absolute value of a number.
     *
     * love6(6, 4) → true
     * love6(4, 5) → false
     * love6(1, 5) → true
     */

    public static void main(String[] args) {

        int a = 26;
        int b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("Result: " + love6(a, b));
    }

    private static boolean love6(int a, int b) {

        if (a == 6 || b == 6) {

            return true;
        }

        if (a + b == 6) {

            return true;
        }

        if (Math.abs(a - b) == 6 || Math.abs(b - a) == 6) {

            return true;
        }

        return false;
    }
}
