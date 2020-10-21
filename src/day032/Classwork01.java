package day032;

public class Classwork01 {

    /**
     * classwork makeChocolate
     *
     * We want make a package of goal kilos of chocolate.
     * We have small bars (1 kilo each) and big bars (5 kilos each).
     * Return the number of small bars to use, assuming we always use big bars before small bars.
     * Return -1 if it can't be done.
     *
     */

    public static void main(String[] args) {

        int smallBars = 10;
        int bigBars = 1;
        int goal = 15;

        System.out.println(makeChocolate(smallBars, bigBars, goal));
    }

    public static int makeChocolate(int small, int big, int goal) {

        int a = (goal - (big * 5));

        if (a <= small && a >= 0) return a;

        if ((a < 0) && (goal % 5 <= small)) return (goal % 5);

        return -1;
    }
}
