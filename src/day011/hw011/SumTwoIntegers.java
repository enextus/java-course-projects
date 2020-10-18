package day011.hw011;

public class SumTwoIntegers {

    /**
     * Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
     *
     * sortaSum(3, 4) → 7
     * sortaSum(9, 4) → 20
     * sortaSum(10, 11) → 21
     */

    public static void main(String[] args) {

        int a = 1;
        int b = 2;


        System.out.println(sortaSum(3, 4));
        System.out.println(sortaSum(9, 4));
        System.out.println(sortaSum(10, 11));

    }

    private static int sortaSum(int a, int b) {

        int sum = a + b;
        if (sum >= 10 && sum <= 19) return 20; // left & right corner return
        return sum;

    }
}
