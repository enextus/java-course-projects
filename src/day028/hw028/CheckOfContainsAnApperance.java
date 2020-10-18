package day028.hw028;

public class CheckOfContainsAnApperance {

    /**
     * Return true if the given string contains an appearance of “xyz”
     * where the xyz is not directly preceeded by a period (.).
     * So “xxyz” counts but “x.xyz” does not.
     * *
     * Expectation:
     * xyzThere("abcxyz") → true
     * xyzThere("abc.xyz") → false
     * xyzThere("xyz.abc") → true
     * *
     * Test:
     * true
     * false
     * true
     */

    public static void main(String[] args) {

        System.out.println(xyzThere("abcxyz"));
        System.out.println(xyzThere("abc.xyz"));
        System.out.println(xyzThere("xyz.abc"));
    }

    private static boolean xyzThere(String str) {

        int index = str.indexOf(".xyz");

        if (index >= 0) return xyzThere(str.substring(0, index)) || xyzThere(str.substring(index + 4));
        else return (str.contains("xyz"));
    }
}
