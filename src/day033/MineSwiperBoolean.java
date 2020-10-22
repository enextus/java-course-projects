package day033;

public class MineSwiperBoolean {

    /**
     * MineSwiperBoolean
     */

    public static void main(String[] args) {

        boolean[][] field = createBooleanField(10);

        printMyField(field);
    }

    private static void printMyField(boolean[][] field) {

        for (boolean[] row : field) {

            for (boolean element : row) {

                System.out.print(element + " ");
            }

            System.out.println();
        }
    }

    private static boolean[][] createBooleanField(int size) {

        final int PERCENT = 10;

        boolean[][] output = new boolean[size][size];

        int bombCount = size * size * PERCENT / 100;
        int count = 0;

        while (count < bombCount) {

            int x = (int) (Math.random() * size);
            int y = (int) (Math.random() * size);

            if (!output[x][y]) {
                output[x][y] = true;

                count++;
            }
        }

        return output;
    }
}
