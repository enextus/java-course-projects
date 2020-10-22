package day033;

import java.util.Arrays;

public class ArrayReverse {

    /**
     * array invert
     *
     * Test:
     * [6, 2, 5, 3]
     * [3, 5, 2, 6]
     *
     * [1, 2]
     * [2, 1]
     *
     * [1]
     * [1]
     */

    public static void main(String[] args) {

        int[] arr1 = new int[]{6, 2, 5, 3};
        int[] arr2 = new int[]{1, 2};
        int[] arr3 = new int[]{1};

        System.out.println(Arrays.toString(arr1));
        arrayInvert(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println();

        System.out.println(Arrays.toString(arr2));
        arrayInvert(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        System.out.println(Arrays.toString(arr3));
        arrayInvert(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println();
    }

    private static void arrayInvert(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {

            int temp = arr[i];

            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
