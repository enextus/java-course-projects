package day022;

public class TwoVariablesValuesSwap {

    /**
     * @param args
     */

    public static void main(String[] args) {

        //  swapFor(); // Test OK
        //  swapOne(); // Test OK
        //  swapTwo(); // Test OK
        swapThree(); // Test OK

        swapFive();
    }

    private static void swapFor() {

        int a = 5;
        int b = 7;

        System.out.println("\"a\" value for the swap. " + a);
        System.out.println("\"b\" value for the swap. " + b);
        System.out.println("\n");

        a = a + b - (b = a);

        System.out.println("\"a\" value after the swap. " + a);
        System.out.println("\"b\" value after the swap. " + b);
    }

    private static void swapOne() {

        int a = 5;
        int b = 7;
        int temp = a;

        System.out.println("\"a\" value for the swap. " + a);
        System.out.println("\"b\" value for the swap. " + b);
        System.out.println("\n");

        a = b;
        b = temp;

        System.out.println("\"a\" value after the swap. " + a);
        System.out.println("\"b\" value after the swap. " + b);
    }

    private static void swapTwo() {

        int a = 5;
        int b = 7;

        System.out.println("\"a\" value for the swap. " + a);
        System.out.println("\"b\" value for the swap. " + b);
        System.out.println("\n");

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\"a\" value after the swap. " + a);
        System.out.println("\"b\" value after the swap. " + b);
    }

    private static void swapThree() {

        int a = 5;
        int b = 7;

        System.out.println("\"a\" value for the swap. " + a);
        System.out.println("\"b\" value for the swap. " + b);
        System.out.println("\n");

        a = a ^ b;
        b = b ^ a;
        a = a ^ b;

        System.out.println("\"a\" value after the swap. " + a);
        System.out.println("\"b\" value after the swap. " + b);
    }

    // a = 10
    //b = 20
    //
    //a ^= b ^= a # Java Code

    private static void swapFive() {

        int a = 5;
        int b = 7;

        System.out.println("\"a\" value for the swap. " + a);
        System.out.println("\"b\" value for the swap. " + b);



        System.out.println("\"a\" value after the swap. " + a);
        System.out.println("\"b\" value after the swap. " + b);


//        a = 5;
//        b = 7;
//
//        b = b ^= a ^= b;
    }
}