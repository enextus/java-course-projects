package day032;

public class Classwork01 {

    /**
     * classwork
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
