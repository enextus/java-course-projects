package day022;

public class RecursionExampleEasy {

    /**
     * recursion example
     * *
     * Test:
     * number: 7
     * number: 6
     * *
     * even number: 6
     * *
     * number: 5
     * number: 4
     * *
     * even number: 4
     * *
     * number: 3
     * number: 2
     * *
     * even number: 2
     * *
     * number: 1
     * number: 0
     * *
     */

    public static void main(String[] args) {

        int number = 7;

        checkItForEven(number);
    }

    private static int checkItForEven(int number) {

        System.out.println("Number: " + number);

        //if (number % 2 == 0) System.out.println("\n-> even number: " + number + "\n");

        if (number == 0) return 0;

        return checkItForEven(number - 1);
    }
}
