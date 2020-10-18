package day011;

public class Exercise11 {

    /**
     *
     */

    public static void main(String[] args) {

        System.out.println("Solution: " + nearTen(12));
        System.out.println("Solution: " + nearTen(17));
        System.out.println("Solution: " + nearTen(18));

    }

    private static boolean nearTen(int a) {

        if ((a % 10) <= 2 || a % 10 >= 8) return true;

        return false;
    }
}
