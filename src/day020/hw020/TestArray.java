package day020.hw020;

public class TestArray {

    /**
     * Given an array:
     * int [] arr = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
     * Find the minimum, average, maximum values and the sum of the array elements.
     * int max;
     * int min;
     * int middle;
     * int sum;
     * *
     * Test:
     * Array: {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, }.
     * Founded Max: 10
     * Founded Min: 1
     * Founded Middle: 5
     * Founded Sum: 55
     */

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        printArray(arr);
        System.out.println("Founded Max: " + findMax(arr));
        System.out.println("Founded Min: " + findMin(arr));
        System.out.println("Founded Middle: " + findMiddle(arr));
        System.out.println("Founded Sum: " + findSum(arr));
    }

    private static int findMax(int[] arr) {

        int c = 0;
        int a = 0;

        do {

            if (arr[c] > a) a = arr[c];
            c++;

        } while (c < arr.length);

        return a;
    }

    private static int findMin(int[] arr) {

        int c = 0;
        int a = arr[0];

        do {

            if (arr[c] < a) a = arr[c];
            c++;

        } while (c < arr.length);

        return a;
    }

    private static int findMiddle(int[] arr) {

        int c = 0;
        int a = 0;

        do {

            a += arr[c];
            c++;

        } while (c < arr.length);

        return a / arr.length;
    }

    private static int findSum(int[] arr) {

        int c = 0;
        int a = 0;

        do {

            a += arr[c];
            c++;

        } while (c < arr.length);

        return a;
    }

    private static void printArray(int[] arr) {

        int c = 0;

        do {

            if (c == 0) System.out.print("Array: {");

            System.out.print(arr[c] + ", ");
            c++;

            if (c == arr.length) System.out.println("}.");

        } while (c < arr.length);
    }
}
