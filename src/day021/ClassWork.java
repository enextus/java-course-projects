package day021;

public class ClassWork {

    /**
     * Classwork:
     * Given two integers,
     * create an array with even numbers in this range.
     * *
     * Test:
     *         int a = 30;
     *         int b = 50;
     *
     * Array: {30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50}.
     *
     *         int a = 20;
     *         int b = 93;
     *
     * Array int[] {20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92}.
     * *
     */

    public static void main(String[] args) {

        int a = 30;
        int b = 50;

        // Data seed:
        // int a = 20;
        // int b = 93;

        printArray(getArrayFromRangeWithOnlyEvenNumbers(a, b));
    }

    private static int[] getArrayFromRangeWithOnlyEvenNumbers(int a, int b) {

        int arrayLength = 0;
        int loopLength = b - a + 1;

        for (int i = 0; i < loopLength; i++) if ((a + i) % 2 == 0) arrayLength++;

        int[] arr = new int[arrayLength];

        int counter = 0;

        for (int i = 0; i < loopLength; i++) {

            if ((a + i) % 2 == 0) arr[counter] = a + i;
            else continue;

            counter++;
        }

        return arr;
    }

    private static void printArray(int[] arr) {

        int c = 0;

        do {

            if (c == 0) System.out.print("Array int[] {");
            else System.out.print(", ");

            System.out.print(arr[c]);
            c++;

            if (c == arr.length) System.out.println("}.");

        } while (c < arr.length);
    }
}
