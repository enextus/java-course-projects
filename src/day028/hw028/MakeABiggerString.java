package day028.hw028;

public class MakeABiggerString {

    /**
     *
     * Given two strings, a and b, create a bigger string made of
     * the first char of a, the first char of b,
     * the second char of a, the second char of b,
     * and so on.
     * Any leftover chars go at the end of the result.
     *
     * Expectation:
     * mixString("abc", "xyz") → "axbycz"
     * mixString("Hi", "There") → "HTihere"
     * mixString("xxxx", "There") → "xTxhxexre"
     *
     * Test:
     *
     */

    public static void main(String[] args) {
        
        mixString("abc", "xyz");
        mixString("Hi", "There");
        mixString("xxxx", "There");

    }

    private static void mixString(String abc, String xyz) {
    }
}
