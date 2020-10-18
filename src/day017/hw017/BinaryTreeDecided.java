package day017.hw017;

public class BinaryTreeDecided {

    /**
     * BinaryTreeDecided
     * Only for testing.
     */

    public static void main(String[] args) {

        int a = 600;
        int b = 30;

        System.out.printf("%d \n", (a / b));
        System.out.println("a % b: " + (a % b));

        int x = 20;
        int y = -5;

        if (y > 0) {
            if (x > 0) System.out.printf("I");
            else System.out.println("II");
        } else {
            if (x < 0) System.out.println("III");
            else System.out.println("IV");
        }
    }
}
