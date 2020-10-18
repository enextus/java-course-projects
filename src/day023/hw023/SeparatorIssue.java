package day023.hw023;

public class SeparatorIssue {

    /**
     * SeparatorIssue.
     * Given two strings, word and a separator sep,
     * return a big string made of count occurrences of the word, separated by the separator string.
     * *
     * Test:
     * WordXWordXWord
     * ThisAndThis
     * This
     */

    public static void main(String[] args) {

        System.out.println(repeatSeparator("Word", "X", 3));
        System.out.println(repeatSeparator("This", "And", 2));
        System.out.println(repeatSeparator("This", "And", 1));
    }

    private static String repeatSeparator(String a, String b, int i) {

        String result = a;

        if (i > 1) for (int c = 1; c < i; c++) result = a + b + result;

        return result;
    }
}
