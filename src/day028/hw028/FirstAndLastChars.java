package day028.hw028;

public class FirstAndLastChars {

    /**
     * Given a string and an int n, return a string made of the first and last n chars from the string.
     * The string length will be at least n.
     * *
     * Expectation:
     * nTwice("Hello", 2) → "Helo"
     * nTwice("Chocolate", 3) → "Choate"
     * nTwice("Chocolate", 1) → "Ce"
     * *
     * Test:
     * Helo
     * Choate
     * Ce
     */

    public static void main(String[] args) {

        System.out.println(nTwice("Hello", 2));
        System.out.println(nTwice("Chocolate", 3));
        System.out.println(nTwice("Chocolate", 1));
    }

    private static String nTwice(String str, int n) {

        String theBegin = str.substring(0, n);
        String theEnd = str.substring(str.length() - n, str.length());

        return theBegin + theEnd;
    }
}
