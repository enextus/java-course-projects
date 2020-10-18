package day028;

public class addAnArrayAtTheEndOfOther {

    /**
     * add two arrays
     */

    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{4, 5, 6};

        printArr(sumOne(arr1, arr2));
    }

    private static int[] sumOne(int[] a, int[] b) {

        int[] c = new int[a.length * 2];

        for (int i = 0; i < (a.length * 2); i++) {

            if (i < a.length) c[i] = a[i];
            else c[i] = b[i - a.length];

        }

        return c;
    }

    private static void printArr(int[] arr) {

        for (int elem : arr) System.out.print(elem + " ");

        System.out.println();
    }
}
