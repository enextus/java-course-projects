package day021.hw021;

public class PrintStringArrayViaLineByLine {

    /**
     * Write a print method for a string array (String [] germanCites)
     * *
     * Test:
     * Array element number 0: Berlin;
     * Array element number 1: Hamburg;
     * Array element number 2: München;
     * Array element number 3: Köln;
     * Array element number 4: Frankfurt am Main;
     * Array element number 5: Stuttgart;
     * Array element number 6: Düsseldorf;
     * Array element number 7: Leipzig;
     * Array element number 8: Dortmund;
     * Array element number 9: Essen;
     * *
     */

    public static void main(String[] args) {

        String[] stringArrayWithCityNames = new String[]
                {
                        "Berlin",
                        "Hamburg",
                        "München",
                        "Köln",
                        "Frankfurt am Main",
                        "Stuttgart",
                        "Düsseldorf",
                        "Leipzig",
                        "Dortmund",
                        "Essen",
                };

        printStringArrayViaLineByLine(stringArrayWithCityNames);

    }

    private static void printStringArrayViaLineByLine(String[] arr) {

        int c = 0;

        do {

            System.out.println("Array element number " + c + ": " + arr[c] + ";");
            c++;

        } while (c < arr.length);
    }
}
