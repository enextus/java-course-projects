package day026;

public class ClassworkStartIssue {

    /**
     * Returns true if for every '*' (star) in the string,
     * if there are chars both immediately before and after the star, they are the same.
     * *
     * Expectation:
     * sameStarChar("xy*yzz") → true
     * sameStarChar("xy*zzz") → false
     * sameStarChar("xb*bzz") → true
     * sameStarChar("*xa*az") → true
     * *
     * sameStarChar("xaaz*") → true
     * *
     * Test:
     * Result: true
     * Result: false
     * Result: true
     * Result: true
     * *
     * Result: true
     */

    public static void main(String[] args) {

        String pattern = "*";

        String word = "xy*yzz";
        // String word = "xy*zzz";
        // String word = "xb*bzz";
        // String word = "*xa*az";
        // String word = "xa*az*";

        String[] status = checkStatusOfEndings(word, pattern);

        if (status[0].equals("1")) {

            System.out.println("Result: " + getNeighborhood(status[1], pattern));

        } else if (status[0].equals("2")) {

            System.out.println("Result: " + getNeighborhood(status[1], pattern));

        } else {

            System.out.println("Result: " + getNeighborhood(status[1], pattern));
        }
    }

    private static boolean getNeighborhood(String shortWord, String pattern) {

        int indexOfPattern = shortWord.indexOf(pattern);

        return shortWord.charAt(indexOfPattern - 1) == shortWord.charAt(indexOfPattern + 1);
    }

    private static String[] checkStatusOfEndings(String word, String pattern) {

        int indexOfPattern = word.indexOf(pattern);

        if (indexOfPattern == 0) {

            return new String[]{"1", word.substring(indexOfPattern + 1)};

        } else if (indexOfPattern == word.length() - 1) {

            return new String[]{"2", word.substring(0, word.length() - 1)};

        } else {

            return new String[]{"3", word};
        }
    }
}
