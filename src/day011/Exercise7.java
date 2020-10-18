package day011;

public class Exercise7 {

    /**
     * last digit of all numbers
     */

    public static void main(String[] args) {

        System.out.println(LastDigit(6, 6, 1236));
        System.out.println(LastDigit(0, 53, 4));
        System.out.println(LastDigit(32222223, 53, 4));
    }

    private static boolean LastDigit(int a, int b, int c) {

        return (a % 10 == b % 10) || (b % 10 == c % 10) || (c % 10 == a % 10);

    }
}
