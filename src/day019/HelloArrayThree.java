package day019;

public class HelloArrayThree {
    public static void main(String[] args) {
        //System.out.println(homeWork18_01());
        myFirstDoubleArrayPrint(homeWork18_01());
        double[] massiv = new double[]{2.4, 5.1, 7.0, 6.6, 1.2, 3.0};
        System.out.println(myMax(massiv)); // 7.0
    }

    private static double myMax(double[] ljuboj) {
        double max = ljuboj[0];
        for (int i = 0; i < ljuboj.length; i++) {
            max = Math.max(max, ljuboj[i]);
        }
        return max;
    }

    private static void myFirstDoubleArrayPrint(double[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);

        }
    }

    private static double[] homeWork18_01() {
        double[] output;
        output = new double[10];
        output[1] = 25.85;
        for (int i = 0; i < output.length; i++) {
            output[i] = Math.random();

        }
        return output;
    }
}

