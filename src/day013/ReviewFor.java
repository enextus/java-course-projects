package day013;

import java.sql.SQLOutput;

public class ReviewFor {
    public static void main(String[] args) {
        // exampleOne();

        // exampleTwo();

        // exampleThree();

        // exampleFour();

        exampleSix();

    }

    private static void exampleSix() {
        for (int i = 1; i < 10; i++) System.out.println(i); // Like as Nested List Comprehensions in Python

        /**
         * >>> Celsius = [39.2, 36.5, 37.3, 37.8]
         * >>> Fahrenheit = [ ((float(9)/5)*x + 32) for x in Celsius ]
         * >>> print Fahrenheit
         * [102.56, 97.700000000000003, 99.140000000000001, 100.03999999999999]
         * >>>
         */
    }

    private static void exampleFour() {

        int i = 0;

        for (; i < 10; ) {
            i++;
            System.out.println(i);
        }
    }

    private static void exampleThree() {
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }
    }

    private static void exampleTwo() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    private static void exampleOne() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
