package day014.hw014;

public class Snowflake {

    /**
     * Draw snowflake makeSnowflake (10)
     * *
     * Test:
     * Snowflake:
     * *             *             *
     *  *            *            *
     *   *           *           *
     *    *          *          *
     *     *         *         *
     *      *        *        *
     *       *       *       *
     *        *      *      *
     *         *     *     *
     *          *    *    *
     *           *   *   *
     *            *  *  *
     *             * * *
     *              ***
     *               *
     *               *
     *              ***
     *             * * *
     *            *  *  *
     *           *   *   *
     *          *    *    *
     *         *     *     *
     *        *      *      *
     *       *       *       *
     *      *        *        *
     *     *         *         *
     *    *          *          *
     *   *           *           *
     *  *            *            *
     * *             *             *
     *
     */

    public static void main(String[] args) {

        int rightCornerSix = 28;

        System.out.println("Snowflake:");

        for (int i = 0; i <= rightCornerSix; i++) {
            for (int j = rightCornerSix; j >= 0; j--) {

                if (((rightCornerSix - i == j) && (j > i - 1)) || ((j == (rightCornerSix / 2)) && (j > i - 1)) || (j == rightCornerSix - i) || (j == rightCornerSix - (rightCornerSix - i))) System.out.print("*");
                else System.out.print(" ");
            }

            if (i < (rightCornerSix - (rightCornerSix / 2))) System.out.println();
            else break;
        }

        System.out.println();

        for (int i = 0; i <= rightCornerSix; i++) {

            for (int j = rightCornerSix; j >= 0; j--) {

                if ((j == (rightCornerSix / 2) - i) || (j == rightCornerSix / 2) || (j == (rightCornerSix / 2) + i)) System.out.print("*");
                else System.out.print(" ");
            }

            if (i < (rightCornerSix - (rightCornerSix / 2))) System.out.println();
            else break;
        }
    }
}
