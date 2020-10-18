package day011.hw011;

public class CheckNumbersRange {

    /**
     * Given a number n, return true if n is in the range 1..10, inclusive.
     * Unless outsideMode is true, in which case return true if the number is less or equal to 1,
     * or greater or equal to 10.
     * *
     * in1To10(11, true) → true ok
     * in1To10(5, false) → true ok
     * in1To10(11, false) → false
     * *
     */

    public static void main(String[] args) {

        System.out.println(intTo10(11, true));
        System.out.println(intTo10(5, false));
        System.out.println(intTo10(11, false));

    }

    private static boolean intTo10(int n, boolean b) {

        return (n >= 1 && n <= 10) && !b || (n <= 1 || n >= 10) && b;
        
    }
}
