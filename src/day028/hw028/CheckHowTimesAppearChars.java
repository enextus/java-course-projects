package day028.hw028;

public class CheckHowTimesAppearChars {

    /**
     * Return true if the string “cat” and “dog” appear the same number of times in the given string.
     *
     * Expectation:
     * catDog("catdog") → true
     * catDog("catcat") → false
     * catDog("1cat1cadodog") → true
     *
     * Test:
     *
     */

    public static void main(String[] args) {

        catDog("catdog");
        catDog("catcat");
        catDog("1cat1cadodog");
    }

    private static boolean catDog(String str) {

        String catPattern = "cat";
        String dogPattern = "dog";

        // str.contains(str11)

        return false;
    }
}
