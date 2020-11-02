package day034;

public class MinesweeperInt {

    /**
     * Minesweeper - one possible part solution
     * *
     * Test:
     * 0  0  0  0  0  0  0  0  0  0
     * -1  0  0  0  0  0  0  0  0  0
     * 0  0  0  0 -1  0  0  0  0  0
     * 0  0  0  0  0  0  0  0  0  0
     * 0  0  0  0  0  0  0  0  0  0
     * 0  0  0  0  0  0 -1  0 -1 -1
     * 0 -1  0  0  0  0 -1  0  0  0
     * 0  0  0  0  0  0  0  0  0  0
     * 0 -1  0  0  0  0  0  0  0  0
     * 0  0  0  0 -1 -1  0  0  0  0
     * *
     * 1  0  0  0  0  0  0  0  0  0
     * -1  1  0  1  1  0  0  0  0  0
     * 1  1  0  1 -1  1  0  0  0  0
     * 0  0  0  0  1  1  0  0  0  0
     * 0  0  0  0  0  1  1  1  2  1
     * 1  1  0  0  0  2 -1  2 -1 -1
     * 1 -1  1  0  0  1 -1  2  1  2
     * 1  2  1  0  0  0  1  1  0  0
     * 1 -1  1  1  2  1  0  0  0  0
     * 0  1  1  1 -1 -1  1  0  0  0
     */

    public static void main(String[] args) {

        int[][] field = createMinefield(10);
        printArray(field);

        setMinesAmounts(field);
        System.out.println();
        printArray(field);
    }

    private static void setMinesAmounts(int[][] field) {

        int bomb = -1;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == bomb) {
                    checkHorizontal(field, i, j);
                    checkVertical(field, i, j);
                    checkLeftUpperRightDownCorner(field, i, j);
                    checkRightUpperLeftDownCorner(field, i, j);
                }
            }
        }
    }

    private static void checkHorizontal(int[][] arr, int y, int x) {

        if (x >= 1)
            if (arr[y][x - 1] != -1) arr[y][x - 1] = arr[y][x - 1] + 1;

        if (x < arr.length - 1)
            if (arr[y][x + 1] != -1) arr[y][x + 1] = arr[y][x + 1] + 1;
    }

    private static void checkVertical(int[][] arr, int y, int x) {

        if (y >= 1)
            if (arr[y - 1][x] != -1) arr[y - 1][x] = arr[y - 1][x] + 1;

        if (y < arr.length - 1)
            if (arr[y + 1][x] != -1) arr[y + 1][x] = arr[y + 1][x] + 1;
    }

    private static void checkLeftUpperRightDownCorner(int[][] arr, int y, int x) {

        if (y >= 1 && x >= 1)
            if (arr[y - 1][x - 1] != -1) arr[y - 1][x - 1] = arr[y - 1][x - 1] + 1;

        if (y < arr.length - 1 && x < arr.length - 1)
            if (arr[y + 1][x + 1] != -1) arr[y + 1][x + 1] = arr[y + 1][x + 1] + 1;
    }

    private static void checkRightUpperLeftDownCorner(int[][] arr, int y, int x) {

        if (y >= 1 && (x >= 1 && x < arr.length - 1))
            if (arr[y - 1][x + 1] != -1) arr[y - 1][x + 1] = arr[y - 1][x + 1] + 1;

        if (y < arr.length - 1 && (x >= 1 && x < arr.length - 1))
            if (arr[y + 1][x - 1] != -1) arr[y + 1][x - 1] = arr[y + 1][x - 1] + 1;
    }

    private static int[][] createMinefield(int size) {

        int[][] output = new int[size][size];

        int bomb = -1;
        int bombPercent = 10;
        int bombCount = (size * size * bombPercent) / 100;

        for (int i = 0; i < bombCount; i++) {

            int x = (int) (Math.random() * size);
            int y = (int) (Math.random() * size);

            if (output[x][y] != bomb) output[x][y] = bomb;
            else i--;
        }

        return output;
    }

    private static void printArray(int[][] field) {

        for (int i = 0; i < field.length; i++) {

            for (int j = 0; j < field[i].length; j++) System.out.printf("%3s", field[i][j]);

            System.out.println();
        }
    }
}
