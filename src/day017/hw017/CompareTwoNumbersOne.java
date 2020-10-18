package day017.hw017;

public class CompareTwoNumbersOne {

    /**
     * You are given two numbers, a and b. Return the larger of them.
     * Don't use any methods from the Math library. Show the ternary operator at work.
     *
     * getMeMax(15, 5) → 15
     * getMeMax(4, 16) → 16
     * getMeMax(20, 100) → 100
     *
     * Test:
     * Max: 100
     */

    public static void main(String[] args) {

        int a = 20, b = 100;

        System.out.println("Max: " + getMeMax(a, b));
    }

    private static int getMeMax(int a, int b) {

        return (a > b) ? a : b;
    }
}
