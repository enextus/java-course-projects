package day030;

import java.util.Arrays;

public class BubbleSortDouble {

    /**
     * BubbleSortDouble
     *
     */

    public static void main(String[] args) {
        double[] myLovelyDoubleArray = new double[]{3.1, 6.18, 18.0, 1.0, 0.5, 100.0};
        System.out.println(Arrays.toString(myLovelyDoubleArray));

        double [] newArray = copyArray(myLovelyDoubleArray);
        bubbleSortDouble(newArray);

        System.out.println(Arrays.toString(newArray));
    }

    private static void bubbleSortDouble(double[] arrUnsorted) {

        int count = 0;

        for (int i = 0; i < arrUnsorted.length-1; i++) {

            if(arrUnsorted[i] <= arrUnsorted[i +1]){
                continue;
            }

            double temp = arrUnsorted[i];
            arrUnsorted[i] = arrUnsorted[i+1];
            arrUnsorted[i+1] = temp;

            count++;
        }

        if(count > 0){
            bubbleSortDouble(arrUnsorted);
        }
    }

    private static double[] copyArray(double[] input) {

        double[] output = new double[input.length];

        System.arraycopy(input, 0, output, 0, input.length);

        return output;
    }
}
