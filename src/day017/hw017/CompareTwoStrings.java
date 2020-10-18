package day017.hw017;

public class CompareTwoStrings {

    /**
     * myFirstCompareTo("Berlin", "Moscow"); → "Berlin"
     * myFirstCompareTo("Minsk", "Moscow"); → "Minsk"
     * myFirstCompareTo("Kyiv", "Paris"); → "Kyiv"
     * myFirstCompareTo("Могилёв", "Потсдам"); → "Могилёв"
     *
     * Test:
     *The first word of two in alphabetical order: Berlin
     * The first word of two in alphabetical order: Minsk
     * The first word of two in alphabetical order: Kyiv
     * The first word of two in alphabetical order: Могилёв
     */

    public static void main(String[] args) {

        String first = "Berlin", two = "Moscow";
        //String first = "Minsk", two = "Moscow";
        //String first = "Kyiv", two = "Paris";
        //String first = "Могилёв", two = "Потсдам";

        System.out.println("The first word of two in alphabetical order: " + myFirstCompareTo(first, two));
    }

    private static String myFirstCompareTo(String a, String b) {

        String result = "";

        int lengthOfa = a.length();
        int lengthOfb = b.length();

        for (int i = 0; i < lengthOfa; i++) {

            if ((char) a.charAt(i) < (char) b.charAt(i)) {

                result = a;
                break;
            }
        }

        return result;
    }
}
