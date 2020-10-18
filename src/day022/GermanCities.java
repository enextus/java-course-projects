package day022;

import java.util.Arrays;

public class GermanCities {
    public static void main(String[] args) {


        String[] myCities = new String[]
                {
                        "Berlin",
                        "München",
                        "Dresden",
                        "Hamburg",
                        "Potsdam"
                };

        myPrintStringArray(myCities);
        myPrintForI(myCities);
    }

    private static void myPrintForI(String[] myCities) {

        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";

        System.out.print("[ ");

        for (int i = 0; i < myCities.length - 1; i++) {

            if (i % 2 == 0) System.out.println(ANSI_RED + myCities[i] + ANSI_RESET);
            else System.out.println(ANSI_GREEN + myCities[i] + ANSI_RESET);

        }

        System.out.println(" ]");
    }

    private static void myPrintStringArray(String[] input) {

        System.out.print("[ ");

        for (String element : input) {

            System.out.print(element + ", ");

        }

        System.out.println("]");
    }
}