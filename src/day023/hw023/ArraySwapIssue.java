package day023.hw023;

public class ArraySwapIssue {

    /**
     * Given an array of ints, swap the first and last elements in the array.
     * Return the modified array.
     * The array length will be at least 1.
     * *
     * Expectation:
     * swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
     * swapEnds([1, 2, 3]) → [3, 2, 1]
     * swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
     * *
     * Test:
     * Array: [4, 2, 3, 1]
     * Array: [3, 2, 1]
     * Array: [5, 6, 7, 9, 8]
     */

    public static void main(String[] args) {

        int[] arrOne = new int[]{1, 2, 3, 4};
        printArray(swapEnds(arrOne));

        int[] arrTwo = new int[]{1, 2, 3};
        printArray(swapEnds(arrTwo));

        int[] arrThree = new int[]{8, 6, 7, 9, 5};
        printArray(swapEnds(arrThree));
    }

    private static int[] swapEnds(int[] arr) {

        int[] copiedArray = new int[arr.length];

        System.arraycopy(arr, 0, copiedArray, 0, arr.length);

        if (copiedArray.length > 1) {

            int temp = copiedArray[copiedArray.length - 1];

            copiedArray[copiedArray.length - 1] = copiedArray[0];
            copiedArray[0] = temp;
        }

        return copiedArray;
    }

    private static void printArray(int[] arr) {

        int counter = 0;

        do {

            if (counter == 0) System.out.print("Array: [");

            System.out.print(arr[counter]);

            if (counter < arr.length - 1) System.out.print(", ");

            counter++;

            if (counter == arr.length) System.out.println("]");

        } while (counter < arr.length);
    }
}
