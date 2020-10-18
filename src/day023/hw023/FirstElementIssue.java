package day023.hw023;

public class FirstElementIssue {

    /**
     * Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
     * If either array is length 0, ignore that array.
     * *
     * Expectation:
     * front11([1, 2, 3], [7, 9, 8]) → [1, 7]
     * front11([1], [2]) → [1, 2]
     * front11([1, 7], []) → [1]
     * *
     * Test:
     * Array: [1, 7]
     * Array: [1, 2]
     * Array: [1]
     */

    public static void main(String[] args) {

        // int[] a = new int[]{1, 2, 3};
        // int[] b = new int[]{7, 9, 8};

        // int[] a = new int[]{1};
        // int[] b = new int[]{2};

        int[] a = new int[]{1, 7};
        int[] b = new int[]{};

        front11(a, b);
        printArray(front11(a, b));
    }

    private static int[] front11(int[] a, int[] b) {

        int[] copiedA = new int[a.length];
        System.arraycopy(a, 0, copiedA, 0, a.length);

        int[] copiedB = new int[b.length];
        System.arraycopy(b, 0, copiedB, 0, b.length);

        int arrLength = (copiedA.length - (copiedA.length - 1)) + (copiedB.length - (copiedB.length - 1));

        if (copiedA.length == 0 || copiedB.length == 0) arrLength = 1;

        int[] resultArray = new int[arrLength];

        if (arrLength == 1) {

            if (copiedA.length != 0) resultArray[0] = copiedA[0];
            if (copiedB.length != 0) resultArray[0] = copiedB[0];

        } else {

            resultArray[0] = copiedA[0];
            resultArray[1] = copiedB[0];
        }

        return resultArray;
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
