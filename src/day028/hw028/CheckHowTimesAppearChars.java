package day028.hw028;

public class CheckHowTimesAppearChars {

    /**
     * Return true if the string “cat” and “dog” appear the same number of times in the given string.
     * <p>
     * Expectation:
     * catDog("catdog") → true
     * catDog("catcat") → false
     * catDog("1cat1cadodog") → true
     * <p>
     * Test:
     */

    public static void main(String[] args) {

        catDog("catdog");
        //catDog("catcat");
        //catDog("1cat1cadodog");
    }

    private static boolean catDog(String str) {

        String catPattern = "cat";
        String dogPattern = "dog";

        int count = 0;

        // str.contains(str11)

        do {

            System.out.println(str);

            count ++;

        } while ( count < str.length());


        return false;
    }
}
