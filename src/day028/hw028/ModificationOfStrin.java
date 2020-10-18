package day028.hw028;

public class ModificationOfStrin {

    /**
     * Given a string, return a version without both the first and last char of the string.
     * The string may be any length, including 0.
     * <p>
     * Expectation:
     * withoutEnd2("Hello") → "ell"
     * withoutEnd2("abc") → "b"
     * withoutEnd2("ab") → ""
     * <p>
     * Test:
     */

    public static void main(String[] args) {

        //String str = "Hello";
        //String str = "abc";
        String str = "ab";

        withoutEnd2(str);

    }

    private static String withoutEnd2(String str) {

        if (str.length() > 1) {


        String theBegin = str.substring(0);


            return theBegin;
        } else

            return str;
    }
}
