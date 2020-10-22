package day033;

import java.util.Arrays;

public class ArrayReverse {

    /**
     * array invert
     *
     * Test:
     * Original array: [6, 2, 5, 3]
     * Resulted array: [3, 5, 2, 6]
     *
     * Original array: [1, 2]
     * Resulted array: [2, 1]
     *
     * Original array: [1]
     * Resulted array: [1]
     */

    public static void main(String[] args) {
        int[] arrOne = new int[]{6, 2, 5, 3};
        int[] arrTwo = new int[]{1, 2};
        int[] arrThree = new int[]{1};

        System.out.println("Original array: " + Arrays.toString(arrOne));
        arrayInvert(arrOne);
        System.out.println("Resulted array: " + Arrays.toString(arrOne) + "\n");

        System.out.println("Original array: " + Arrays.toString(arrTwo));
        arrayInvert(arrTwo);
        System.out.println("Resulted array: " + Arrays.toString(arrTwo) + "\n");

        System.out.println("Original array: " + Arrays.toString(arrThree));
        arrayInvert(arrThree);
        System.out.println("Resulted array: " + Arrays.toString(arrThree) + "\n");
    }

    private static void arrayInvert(int[] arr) {
        int arrLength = arr.length;

        for (int i = 0; i < arrLength / 2; i++) {
            int temp = arr[i];

            arr[i] = arr[arrLength - 1 - i];
            arr[arrLength - 1 - i] = temp;
        }
    }
}
