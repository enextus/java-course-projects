package day021.hw021;

public class MakeArrayWithPrimeNumbersFromRange {

    /**
     * Given two integers,
     * create an array with prime numbers in this range.
     * *
     * Test:
     * int a = 30;
     * int b = 50;
     * Array int[] {31, 37, 41, 43, 47}.
     * <p>
     * int a = 20;
     * int b = 93;
     * Array int[] {23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89}.
     */

    public static void main(String[] args) {

        int a = 2;
        int b = 1000;

        printArray(getArrayFromRangeWithOnlyPrimeNumbers(a, b));
    }

    private static int[] getArrayFromRangeWithOnlyPrimeNumbers(int a, int b) {

        int loopLength = b - a + 1;
        int arrayLength = 0;

        for (int i = 0; i < loopLength; i++) if (isPrime(a + i)) arrayLength++;

        int[] arr = new int[arrayLength];

        int counter = 0;

        for (int i = 0; i < loopLength; i++) {

            if (isPrime(a + i))
                arr[counter] = a + i;
            else continue;

            counter++;
        }

        return arr;
    }

    public static boolean isPrime(int number) {

        if (number % 2 == 0)
            return number == 2;

        int limit = (int) (0.1 + Math.sqrt(number));

        for (int i = 3; i <= limit; i += 2) {
            if (number % i == 0)
                return false;
        }

        return true;
    }

    private static void printArray(int[] arr) {

        int c = 0;

        do {

            if (c == 0)
                System.out.print("Array int[] {");
            else
                System.out.print(", ");

            System.out.print(arr[c]);
            c++;

            if (c == arr.length)
                System.out.println("}.");

        } while (c < arr.length);
    }
}
