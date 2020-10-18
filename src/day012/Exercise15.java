package day012;

public class Exercise15 {

    /**
     * Given 2 ints, a and b, return their sum.
     * However, "teen" values in the range 13..19 inclusive, are extra lucky.
     * So if either value is a teen, just return 19.
     * *
     * teenSum(3, 4) → 7
     * teenSum(10, 13) → 19
     * teenSum(13, 2) → 19
     */

    public static void main(String[] args) {

        int a = 1;
        int b = 2;


        System.out.println(teenSum(3, 4));
        System.out.println(teenSum(10, 13));
        System.out.println(teenSum(13, 2));

    }

    private static int teenSum(int a, int b) {

        int sum = a + b;

        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) return 19; // searching range return

        return sum;

    }
}
