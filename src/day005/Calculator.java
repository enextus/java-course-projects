package day005;

public class Calculator {
    public static void main(String[] args) {
        multiplicationOne();

        // System.out.println("test 1: " + 4 + 5 );
        // System.out.println("test 1: " + ( 4 + 5 ));

        int a = 1;
        String s = "1";

        // System.out.println(a + a);
        // System.out.println(s + s);



        int myLovelyVariable = multiplicationTwo(1, 2, 3, 4);

        System.out.println("myLovelyVariable: " + myLovelyVariable);

    }

    public static int multiplicationTwo(int a, int b, int c, int d) {
        int result = a * b * c * d;

        return result;
    }

    public static void multiplicationOne() {
        // System.out.println("multiplication: " + 5 * 6);
    }

    public static void multiplication() {
        // System.out.println("multiplication: " + 5 * 6);
    }
}
