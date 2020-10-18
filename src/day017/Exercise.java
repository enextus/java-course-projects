package day017;

public class Exercise {

    /**
     * Given a string, return a string where for every char in the original, there are two chars.
     */

    public static void main(String[] args) {

        String inputChar = "abc";

        System.out.println(doubleChar(inputChar));
    }

    private static String doubleChar(String inputChar) {

        String output = "";

        for (int i = 0; i < inputChar.length(); i++) {
            output += inputChar.charAt(i) + "" + inputChar.charAt(i);
        }

        return output;
    }
}
