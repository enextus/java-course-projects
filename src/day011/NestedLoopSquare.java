package day011;

public class NestedLoopSquare {

    /**
     * bake pies
     */

    public static void main(String[] args) {

        int a = 10;
        int b = 10;

        rectangle(a, b);

    }

    private static void rectangle(int a, int b) {

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {

                System.out.print("*");

            }

            System.out.println(); // ne line

        }
    }
}
