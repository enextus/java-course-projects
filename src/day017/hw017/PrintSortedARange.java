package day017.hw017;

public class PrintSortedARange {

    /**
     * Output in ascending order all numbers between A and B, where a = 5 and B = 17.
     *
     * Test:
     * 1. number between 5 and 17: 6
     * 2. number between 5 and 17: 7
     * 3. number between 5 and 17: 8
     * 4. number between 5 and 17: 9
     * 5. number between 5 and 17: 10
     * 6. number between 5 and 17: 11
     * 7. number between 5 and 17: 12
     * 8. number between 5 and 17: 13
     * 9. number between 5 and 17: 14
     * 10. number between 5 and 17: 15
     * 11. number between 5 and 17: 16
     */

    public static void main(String[] args) {

        int a = 5;
        int b = 17;

        int counter = a + 1;

        do {

            System.out.println((counter - a) + ". number between 5 and 17: " + counter);
            counter++;

        } while (counter < b);
    }
}
