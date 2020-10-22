package day033;

public class Classwork033 {

    /**
     * mineswiper
     */

    public static void main(String[] args) {

        String[][] miner = new String[10][10];

        minesSwiper(miner, 10);
        printMySwiper(miner);
    }

    private static void printMySwiper(String[][] miner) {

        for (String[] simpleArray : miner) {
            for (String element : simpleArray) {

                System.out.print(element + " ");
            }

            System.out.println();
        }
    }

    private static void minesSwiper(String[][] miner, int percent) {

        int fieldCount = miner.length * miner[0].length;

        System.out.println(fieldCount);

        int bombCount = fieldCount * percent / 100;

        String bomb = "*";
        String empty = "_";

        for (int i = 0; i< miner.length; i++) {

            for ( int j = 0; j< miner[i].length; j++) {

                miner[i][j] = empty;
            }

        }

        int count = 0;

        while (count < bombCount) {

            int x = (int) (Math.random() * miner.length);
            int y = (int) (Math.random()) * miner[x].length;

            if (!(miner[x][y].equals(bomb))) {
                miner[x][y] = bomb;

                count++;
            }
        }
    }
}
