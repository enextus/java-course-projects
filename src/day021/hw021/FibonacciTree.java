package day021.hw021;

public class FibonacciTree {

    /**
     * Fibonacci tree implementation
     *
     * Test:
     *
     * ***************************************************************************************** 89
     * ******************************************************* 55
     * ********************************** 34
     * ********************* 21
     * ************* 13
     * ******** 8
     * ***** 5
     * *** 3
     * ** 2
     * * 1
     * * 1
     *
     */

    public static void main(String[] args) {

        int numberOfLevels = 11;

        for (int i = numberOfLevels; i > 0; i--) {

            int level = fibonacciGenerate(i);

            for (int j = 0; j < level; j++) System.out.print("*");

            System.out.println(" " + level);

        }
    }

    public static int fibonacciGenerate(int x) {

        if (x == 0 || x == 1) return x;

        return fibonacciGenerate(x - 1) + fibonacciGenerate(x - 2);
    }

}
