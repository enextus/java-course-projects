package day022;

public class Classwork {

    /**
     * getFactorial
     */

    public static void main(String[] args) {

        System.out.println("getFactorial: " + getFactorial(6));
    }

    private static int getFactorial(int num) {

        if (num >= 1) return num * getFactorial(num - 1);
        else return 1;

    }
}
