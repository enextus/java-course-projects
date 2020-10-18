package day009.hw9;

public class SumThreeNumbers {
    /**
     * Given three integers, return their sum.
     * If the first and third numbers are equal to each other, then return the second if sum is zero, then return -1.
     * <p>
     * mySum(5, 6, 5) -> 6
     * mySum(5, 6, 7) -> 18
     * mySum(0, 0, 0) -> 0
     * mySum(0, -5, 5) -> -1
     */

    public static void main(String[] args) {

        int numberOne = 0;
        int numberTwo = -5;
        int numberThree = 5;

        System.out.println("Sum: " + mySum(numberOne, numberTwo, numberThree));
    }

    private static int mySum(int a, int b, int c) {

        int sum = a + b + c;

        if (a == c) return b; // "quasi safe guard statement"
        else if (sum == 0) return -1; // "quasi safe guard statement"
        else return sum;
    }
}
