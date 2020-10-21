package day032;

public class Classwork01 {

    /**
     * classwork
     */

    public static void main(String[] args) {

        //

        int smallBars = 4; int bigBars = 1; int goal = 15;

        System.out.println(makeChocolate(smallBars, bigBars, goal));
    }

    public static int makeChocolate(int a, int b, int c) {

        int rem = c % 5;

        if (a + (b * 5) < c)
            return -1;

        else if ((rem <= a)&& (c - b * 5 > 4))
            return rem + 5;

        else if (rem <= a)
            return rem;
        else
            return -1;
    }
}


