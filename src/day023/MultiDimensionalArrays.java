package day023;

public class MultiDimensionalArrays {

    /**
     * MultiDimensionalArrays
     */

    public static void main(String[] args) {

        int[][] monthCalendar;

        monthCalendar = new int[4][7];

        for (int i = 0; i < monthCalendar.length; i++) {

            for (int j = 0; j < monthCalendar[i].length; j++) {
                monthCalendar[i][j] = i * 7 + j + 1;
                System.out.printf("  %d", monthCalendar[i][j]);
            }

            System.out.println();
        }
    }
}
