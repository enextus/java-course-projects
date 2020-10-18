package day017.hw017;

public class CompareTwoNumbersTwo {

    /**
     * You are given two numbers, a and b. Return the lesser of them.
     * Don't use any methods from the Math library. Show the ternary operator at work.
     *
     * getMeMin(15, 45) → 15
     * getMeMin(44, 16) → 16
     * getMeMin(200, 100) → 100
     *
     * Test:
     * Min: 15
     */

    public static void main(String[] args) {

        int a = 15, b = 45;

        System.out.println("Min: " + getMeMin(a, b));
    }

    private static int getMeMin(int a, int b) {

        return (a < b) ? a : b;
    }
}
