package day011;

public class Exercises5 {

    /**
     *
     */

    public static void main(String[] args) {

        System.out.println(nearTen(0, 53, 4));
    }

    private static int nearTen(int a, int b, int c) {

        if (a < 5 || b < 5) return 0;
        else if ((a >= (a * 2)) || (b >= (b * 2))) return 2;

        return 1;
    }
}
