package day016;

public class MagicTableDoWhile {

    public static void main(String[] args) {
        createTable(10);

    }

    private static void createTable(int number) {

        int i = 1;

        do {
            int j = 1;

            do {

                System.out.printf("%3d", i * j);
                j++;

            } while (j <= number);

            System.out.println();
            i++;

        } while (i <= number);
    }
}
