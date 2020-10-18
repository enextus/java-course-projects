package day018;

public class RowOfBricks {

    /**
     * We want to make a row of bricks that is goal inches long.
     *
     * We have a number of small bricks (1 inch each) and big bricks (5 inches each).
     * Return true if it is possible to make the goal by choosing from the given bricks.
     *
     * This is a little harder than it looks and can be done without any loops.
     * *
     * See also: Introduction to MakeBricks:
     * makeBricks(3, 1, 8) → true
     * makeBricks(3, 1, 9) → false
     * makeBricks(3, 2, 10) → false
     */

    public static void main(String[] args) {

        int countSmallBricks = 3;
        int countBigBricks = 1;
        int goal = 8;

        System.out.println(makeBricks(countSmallBricks, countBigBricks, goal));
    }

    private static boolean makeBricks(int countSmallBricks, int countBigBricks, int goal) {

        int lengthOfSmallBricks = 1;
        int lengthOfBigBricks = 5;

        int lengthOfRow = ((countSmallBricks * lengthOfSmallBricks) + (countBigBricks * lengthOfBigBricks));

        return lengthOfRow == goal;
    }
}
