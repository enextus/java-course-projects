package day014.hw014;

public class ChessBoard {

    /**
     * Display the characters in a checkerboard pattern.
     */

    public static void main(String[] args) {

        for (int i = 1; i < 8; i++) {
            for (int j = 1; j <= 4; j++) {

                if ((i % 2) == 0) System.out.print("_*");
                else System.out.print("*_");

                if ((j % 4) == 0) System.out.print("\n");
            }
        }

        /**
         * Test:
         * *_*_*_*_
         * _*_*_*_*
         * *_*_*_*_
         * _*_*_*_*
         * *_*_*_*_
         * _*_*_*_*
         * *_*_*_*_
         */
    }
}

