package day014.hw014;

public class PrintSomeTriangles {

    /**
     * The previous task is very important.
     * And it is important that you can solve it yourself.
     * If you decide, then try to complicate the required and draw an isosceles triangle.
     * And then all the figures from the picture below.
     */

    public static void main(String[] args) {

        // 1. triangle
        int rightCornerOne = 10;

        System.out.println("1. triangle");

        for (int i = 0; i <= rightCornerOne; i++) {
            for (int j = (rightCornerOne - i); j > 1; j--) {

                System.out.print("*");
            }

            System.out.println();
        }

        // Separator
        System.out.println("\n------------------------------------------------------------------------");

        // 2. triangle
        int rightCornerTwo = 10;

        System.out.println("2. triangle");

        for (int i = 0; i <= rightCornerTwo; i++) {
            for (int j = 0; j <= rightCornerTwo; j++) {

                if (j >= (rightCornerTwo - i)) System.out.print("*");
                else System.out.print(" ");
            }

            System.out.println();
        }

        // Separator
        System.out.println("\n------------------------------------------------------------------------");

        // 3. triangle
        int rightCornerThree = 14;

        System.out.println("3. triangle");

        for (int i = 0; i <= rightCornerThree; i++) {
            for (int j = 0; j <= rightCornerThree; j++) {

                if ((j <= (((rightCornerThree / 2)) - i)) || (j >= (((rightCornerThree / 2)) + i)))
                    System.out.print(" ");
                else System.out.print("*");
            }

            if (i <= (rightCornerThree - (rightCornerThree / 2))) System.out.println();
            else break;
        }

        // Separator
        System.out.println("\n");
        System.out.println("------------------------------------------------------------------------");

        // 4. Triangle
        int rightCornerFour = 10;

        System.out.println("4. triangle");

        for (int i = 0; i <= rightCornerFour; i++) {
            for (int j = 0; j <= rightCornerFour; j++) {

                if ((j < i)) System.out.print(" ");
                else System.out.print("*");
            }

            System.out.println();
        }

        // Separator
        System.out.println("\n");
        System.out.println("------------------------------------------------------------------------");


        // 5. Triangle
        int rightCornerFive = 10;

        System.out.println("5. triangle");

        for (int i = 0; i <= rightCornerFive; i++) {
            for (int j = 0; j <= rightCornerFive; j++) {

                if (j < ((rightCornerFive / 2) - i) || (j > (rightCornerFive / 2) + i)) System.out.print(" ");
                else System.out.print("*");
            }

            if (i < (rightCornerFive - (rightCornerFive / 2))) System.out.println();
            else break;
        }

        // Separator
        System.out.println("\n");
        System.out.println("------------------------------------------------------------------------");


        // 6. Six
        int rightCornerSix = 8;

        System.out.println("6. triangle");

        for (int i = 0; i <= rightCornerSix; i++) {
            for (int j = rightCornerSix; j >= 0; j--) {

                if (((rightCornerSix - i >= j) && (j > i - 1)) || ((j <= (rightCornerSix / 2)) && (j > i - 1)))
                    System.out.print("*");
                else System.out.print(" ");
            }

            if (i < (rightCornerSix - (rightCornerSix / 2))) System.out.println();
            else break;
        }

        // Separator
        System.out.println("\n");
        System.out.println("------------------------------------------------------------------------");

        // 7. Triangle
        int rightCornerSeven = 30;

        System.out.println("7. Triangle");

        for (int i = 0; i <= rightCornerSeven; i++) {
            for (int j = 0; j <= rightCornerSeven; j++) {

                if (j < ((rightCornerSeven / 2) - i) || (j > (rightCornerSeven / 2) + i)) System.out.print(" ");
                else System.out.print("*");
            }

            if (i < (rightCornerSeven - (rightCornerSeven / 2))) System.out.println();
            else break;
        }

        System.out.println();

        for (int i = 0; i <= rightCornerSeven; i++) {
            for (int j = rightCornerSeven; j >= 0; j--) {

                if (((rightCornerSeven - i >= j) && (j > i - 1)) || ((j <= (rightCornerSeven / 2)) && (j > i - 1)))
                    System.out.print("*");
                else System.out.print(" ");
            }

            if (i < (rightCornerSeven - (rightCornerSeven / 2))) System.out.println();
            else break;
        }


        /**
         * Test:
         * 1. triangle
         * *********
         * ********
         * *******
         * ******
         * *****
         * ****
         * ***
         * **
         * *
         *
         *
         *
         * ------------------------------------------------------------------------
         * 2. triangle
         *           *
         *          **
         *         ***
         *        ****
         *       *****
         *      ******
         *     *******
         *    ********
         *   *********
         *  **********
         * ***********
         *
         * ------------------------------------------------------------------------
         * 3. triangle
         *
         *        *
         *       ***
         *      *****
         *     *******
         *    *********
         *   ***********
         *  *************
         * ***************
         *
         * ------------------------------------------------------------------------
         * 4. triangle
         * ***********
         *  **********
         *   *********
         *    ********
         *     *******
         *      ******
         *       *****
         *        ****
         *         ***
         *          **
         *           *
         *
         *
         * ------------------------------------------------------------------------
         * 5. triangle
         *      *
         *     ***
         *    *****
         *   *******
         *  *********
         * ***********
         *
         * ------------------------------------------------------------------------
         * 6. triangle
         * *********
         *  *******
         *   *****
         *    ***
         *     *
         *     ------------------------------------------------------------------------
         * 7. Triangle
         *
         *                *
         *               ***
         *              *****
         *             *******
         *            *********
         *           ***********
         *          *************
         *         ***************
         *        *****************
         *       *******************
         *      *********************
         *     ***********************
         *    *************************
         *   ***************************
         *  *****************************
         * *******************************
         * *******************************
         *  *****************************
         *   ***************************
         *    *************************
         *     ***********************
         *      *********************
         *       *******************
         *        *****************
         *         ***************
         *          *************
         *           ***********
         *            *********
         *             *******
         *              *****
         *               ***
         *                *
         * *
         */
    }
}
