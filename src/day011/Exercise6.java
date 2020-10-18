package day011;

public class Exercise6 {
    public static void main(String[] args) {

        threeNumbers();

    }

    private static void threeNumbers() {

        for (int x = 1; x <= 36; x++) {

            System.out.println("x = " + x);

            for (int y = x; y <= 36; y++) {

                System.out.println("    y = " + y);

                for (int z = y; z <= 36; z++) {

                    System.out.println("        z = " + z);

                    if (x * y * z == 36) {

                        System.out.println("Solution who variables: " + "x = " + x
                                + ", y = " + y
                                + ", z = " + z);

                    }
                }
            }
        }
    }
}
