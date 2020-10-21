package day032;

public class MyAssert {

    /**
     * my assert
     */

    public static void main(String[] args) {

        int a = 1_345_456_345;
        int b = 1_345_456_345;
        
        System.out.println("sum (a, b): " + sum (a, b));
    }

    private static int sum(int a, int b) {

        assert (Integer.MAX_VALUE -a >= b) : "Value of " + a + " + " + b + " is to large to add.";

        final int output = a +b;

        assert  (output - a == b) : "sum" + output;

        return output;
    }
}
