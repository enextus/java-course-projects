package day032;

public class Classwork01 {

    /**
     * classwork
     */

    public static void main(String[] args) {

        //

        int smallBars = 0;
        int bigBars = 0;
        int goal = 15;

        System.out.println(makeChocolate(smallBars, bigBars, goal));
    }

    public static int makeChocolate(int small, int big, int goal) {

        int rem = goal % 5;

        if (small + (big * 5) < goal)
            return -1;

        else if (rem <= small && goal - big * 5 > 4)
            return rem + 5;

        else if (rem <= small)
            return rem;
        else
            return -1;
    }
}


