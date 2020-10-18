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
     */

    public static void main(String[] args) {

        //catDog("catdog");
        //catDog("catcat");
        catDog("1cat1cadodog");
    }

    private static boolean catDog(String str) {

        String catPattern = "cat";
        String dogPattern = "dog";

        counterString(String str, String catPattern);


        return false;
    }


    private int counterString(String str, String pattern) {
        int times = 0;
        int index = str.indexOf(pattern, 0);

        while (index > 0) {

            index = str.indexOf(pattern, index + 1);

            ++times;
        }

        return times;
    }
}
