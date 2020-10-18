package day014.hw014;

public class PrintTriangle {

    /**
     * "Draw / Console" the asterisk triangle using only one asterisk and what you just learned.
     */

    public static void main(String[] args) {

        for (int i = 1; i <= 11; i++) {
            for (int j = 1; j < i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

        /**
         * Test:
         * *
         * **
         * ***
         * ****
         * *****
         * ******
         * *******
         * ********
         * *********
         * **********
         *
         * Process finished with exit code 0
         */
    }
}
