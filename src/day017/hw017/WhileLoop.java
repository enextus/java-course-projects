package day017.hw017;

public class WhileLoop {

    /**
     * Given integers A and B, where B> 0. Output B times the number A.
     *
     * Test:
     * Attempt: 5 -> a: 1;
     * Attempt: 4 -> a: 1;
     * Attempt: 3 -> a: 1;
     * Attempt: 2 -> a: 1;
     * Attempt: 1 -> a: 1;
     */

    public static void main(String[] args) {

        int a = 1, b = 5;
        int count = b;

        while (count > 0) {

            System.out.println("Attempt: " + count + " -> a: " + a + ";");

            count--;
        }
    }
}
