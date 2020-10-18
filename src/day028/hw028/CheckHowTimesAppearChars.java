package day028.hw028;

public class CheckHowTimesAppearChars {

    /**
     * Return true if the string “cat” and “dog” appear the same number of times in the given string.
     * *
     * Expectation:
     * catDog("catdog") → true
     * catDog("catcat") → false
     * catDog("1cat1cadodog") → true
     * *
     * Test:
     * true
     * false
     * true
     */

    public static void main(String[] args) {

        System.out.println(catDog("catdog"));
        System.out.println(catDog("catcat"));
        System.out.println(catDog("1cat1cadodog"));
    }

    private static boolean catDog(String str) {

        String catPattern = "cat";
        String dogPattern = "dog";

        return counterString(str, catPattern) == counterString(str, dogPattern);
    }

    private static int counterString(String str, String pattern) {

        int counter = 0;
        int index = str.indexOf(pattern, 0);

        while (index >= 0) {

            index = str.indexOf(pattern, index + 1);
            ++counter;
        }

        return counter;
    }
}
