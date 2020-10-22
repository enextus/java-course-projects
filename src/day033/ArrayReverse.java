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
        int[] arr1 = new int[]{6, 2, 5, 3};
        int[] arr2 = new int[]{1, 2};
        int[] arr3 = new int[]{1};

        System.out.println("Original array: " + Arrays.toString(arr1));
        arrayInvert(arr1);
        System.out.println("Resulted array: " + Arrays.toString(arr1) + "\n");

        System.out.println("Original array: " + Arrays.toString(arr2));
        arrayInvert(arr2);
        System.out.println("Resulted array: " + Arrays.toString(arr2) + "\n");

        System.out.println("Original array: " + Arrays.toString(arr3));
        arrayInvert(arr3);
        System.out.println("Resulted array: " + Arrays.toString(arr3) + "\n");
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
