package day023.hw023;

public class ZipZapIssue {

    /**
     * Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
     * Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
     * *
     * Expectation:
     * zipZap("zipXzap") → "zpXzp"
     * zipZap("zopzop") → "zpzp"
     * zipZap("zzzopzop") → "zzzpzp"
     * *
     * Test:
     * zpXzp
     * zpzp
     * zzzpzp
     * zpXzp
     * zpTzp
     * ppzpzp
     * ppzpzp
     * *
     */

    public static void main(String[] args) {

        System.out.println(zipZap("zipXzap"));
        System.out.println(zipZap("zopzop"));
        System.out.println(zipZap("zzzopzop"));

        System.out.println(zipZap("zupXzep"));
        System.out.println(zipZap("zopTTTzop"));
        System.out.println(zipZap("ppzkpzkp"));

        System.out.println(zipZap("ppppppppzkpzkp"));
    }

    private static String zipZap(String a) {

        String input = a;
        String pZ = "z"; //pattern Z
        String pP = "p"; //pattern P

        if (input.toCharArray()[0] == input.toCharArray()[1]) {

            String trimmedInput = input.substring(2);

            return input.substring(0, 2) +
                    trimmedInput.substring(getIndex(trimmedInput, pZ, pP)[0], getIndex(trimmedInput, pZ, pP)[0] + 1) +
                    trimmedInput.substring(getIndex(trimmedInput, pZ, pP)[2], getIndex(trimmedInput, pZ, pP)[2] + 1) +
                    trimmedInput.substring(getIndex(trimmedInput, pZ, pP)[1], getIndex(trimmedInput, pZ, pP)[1] + 1) +
                    trimmedInput.substring(getIndex(trimmedInput, pZ, pP)[3], getIndex(trimmedInput, pZ, pP)[3] + 1);

        } else if (getIndex(input, pZ, pP)[1] - getIndex(input, pZ, pP)[2] == 1) {

            return input.substring(getIndex(input, pZ, pP)[0], getIndex(input, pZ, pP)[0] + 1) +
                    input.substring(getIndex(input, pZ, pP)[2], getIndex(input, pZ, pP)[2] + 1) +
                    input.substring(getIndex(input, pZ, pP)[1], getIndex(input, pZ, pP)[1] + 1) +
                    input.substring(getIndex(input, pZ, pP)[3], getIndex(input, pZ, pP)[3] + 1);

        } else {

            return input.substring(getIndex(input, pZ, pP)[0], getIndex(input, pZ, pP)[0] + 1) +
                    input.substring(getIndex(input, pZ, pP)[2], getIndex(input, pZ, pP)[2] + 1) +
                    input.substring(getIndex(input, pZ, pP)[2] + 1, getIndex(input, pZ, pP)[2] + 2) +
                    input.substring(getIndex(input, pZ, pP)[1], getIndex(input, pZ, pP)[1] + 1) +
                    input.substring(getIndex(input, pZ, pP)[3], getIndex(input, pZ, pP)[3] + 1);
        }
    }

    private static int[] getIndex(String a, String b, String c) {

        return new int[]{a.indexOf(b), a.lastIndexOf(b), a.indexOf(c), a.lastIndexOf(c)};
    }
}
