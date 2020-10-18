package day023.hw023;

public class SandwichIssue {

    /**
     * A sandwich is two pieces of bread with something in between.
     * Return the string that is between the first and last appearance of "bread"
     * in the given string,
     * or return the empty string "" if there are not two pieces of bread.
     * *
     * Test:
     * jam
     * jam
     *
     *
     */

    public static void main(String[] args) {

        System.out.println(getSandwich("breadjambread"));
        System.out.println(getSandwich("xxbreadjambreadyy"));
        System.out.println(getSandwich("xxbreadyy"));
    }

    private static String getSandwich(String input) {

        String result = "";
        String pattern = "bread";

        int firstIndex = input.indexOf(pattern);
        int lastIndex = input.lastIndexOf(pattern);

        if (firstIndex != lastIndex) return input.substring(firstIndex + pattern.length(), lastIndex);

        return result;
    }
}
