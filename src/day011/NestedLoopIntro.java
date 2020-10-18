package day011;

public class NestedLoopIntro {

    /**
     * nested loops
     */

    public static void main(String[] args) {

        int count = 3;

        for (int i = 0; i <= count; i++) {

            System.out.println("i = " + i);

            for (int j = 0; j < i; j++) {

                System.out.println("    " + "j = " + j);

                for (int k = 0; k < i; k++) {

                    System.out.println("        " + "k = " + k);

                }
            }
        }
    }
}
