package day034;

public class MinesweeperInt {

    /**
     * Minesweeper - one possible solution
     */

    public static void main(String[] args) {

        // 1. Создать поле (двумерный массив) createField()
        // 2. Вывести на экран
        // 3. Указать кол-во бомб
        // 4. Установить бомбы
        // 5. Расписать поле по установке: 0-0, 1-1, 2-2 ... 8-8
        // 5.а проверяем каждую клетку по горизонтали, в обе стороны [i, j+1] и [i, j-1]
        // 5.b проверка по вертикали [i-1, j], [i+1, j]
        // 5.c проверяем верхний левый угол [i-1, j-1]
        // 5.d проверяем верхний правый угол [i-1, j+1]
        // 5.e проверяем нижний левый угол [i+1, j-1]
        // 5.f проверяем нижний правый угол [i+1, j+1]
        // 6. проверка начала и конца массива
        // 7. проверка ниличия бомб в клетках проверки

        int[][] field = createMinefield(10);
        printArray(field);

        setMinesAmounts(field);
        // printArray(field);
    }

    private static void setMinesAmounts(int[][] field) {

        int bomb = -1;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == bomb) {
                    searchHorizontal(field, i, j);
                    // searchVertical(field, i, j);
                }
            }
        }
    }

    private static void searchHorizontal(int[][] arr, int y, int x) {

        if (arr.length - 1 != y) {

            System.out.println("y: " + y);
            System.out.println("x: " + x);

            System.out.println("arr[y][x - 1]: " + arr[y][x - 1]);
            System.out.println("arr[y][x]: " + arr[y][x]);
            System.out.println("arr[y][x + 1]: " + arr[y][x + 1]);

            // arr[x][y - 1] = arr[x][y - 1] + 1;
        }
    }

    private static void searchVertical(int[][] arr, int y, int x) {

        if (arr.length - 1 != x) {

            System.out.println("arr.length: " + arr.length);

            System.out.println("x: " + x);
            System.out.println("y: " + y);

            System.out.println("arr[y - 1][x]: " + arr[y - 1][x]);
            System.out.println("arr[y][x]: " + arr[y][x]);
            System.out.println("arr[y + 1][x]: " + arr[y + 1][x]);

            // arr[x][y - 1] = arr[x][y - 1] + 1;
        }
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
