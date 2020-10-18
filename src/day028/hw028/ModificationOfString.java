package day028.hw028;

public class ModificationOfString {

    /**
     * Given a string, return a version without both the first and last char of the string.
     * The string may be any length, including 0.
     * *
     * Expectation:
     * withoutEnd2("Hello") → "ell"
     * withoutEnd2("abc") → "b"
     * withoutEnd2("ab") → ""
     * *
     * Test:
     * ell
     * b
     */

    public static void main(String[] args) {

        String str = "Hello";
        // String str = "abc";
        // String str = "ab";
        // String str = "a";
        // String str = "";

        System.out.println(withoutEnd2(str));
    }

    private static String withoutEnd2(String str) {

        String result = "";

        if (str.length() > 2) result = str.substring(1, str.length() - 1);
        return result;
    }
}
