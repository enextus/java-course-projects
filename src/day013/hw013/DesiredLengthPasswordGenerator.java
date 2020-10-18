package day013.hw013;

import java.util.ArrayList;
import java.util.List;

public class DesiredLengthPasswordGenerator {
    public static void main(String[] args) {

        // Input restrictions: minimum password length 6 && maximum password length 128

        int passwordLength = 8;

        if (passwordLength < 6) passwordLength = 6;
        if (passwordLength > 128) passwordLength = 128;

        int a = passwordLength;

        System.out.println("Desired password length: " + passwordLength);

        if ((a % 3) != 0) a = (a - (a % 3) + 3) / 3;
        else a /= 3;

        String strOut = getPasswordWithWantedLength(a);
        strOut = getStrOut(strOut, passwordLength);

        System.out.println("Your password with the length " + passwordLength + " is: " + shuffleString(strOut));

        // Tests:
        // passwordLength = 3 -> Your password with the length 6 is: 4~1io,
        // passwordLength = 6 -> Your password with the length 6 is: b#8x]5
        // passwordLength = 8 -> Your password with the length 8 is: z*02[e|q
        // passwordLength = 128 -> Your password with the length 128 is: d6%)v$h_5g151/&4pb*a~z3p68@n2*o2%)!1&y`0p'11pg$7`h9$)00r`9`7{<i1)z6.jy,$jq[v]61n`oh6&ge7|32[82<ww4u4n35<9s35^n[9o2lp[dg4<r2(^{ym
        // passwordLength = 130 -> Your password with the length 128 is: 7:b0i7=04~u3l,72@ll|1z's2/2_6l9_h'5jt70s3khzh@?hb7:tm?=19!!^x=*7gjo}.yjm+'7(w;zl9/@rfx7?0.f:/37653@9z&3i$/@sw@.6030e639z364&mu*>

    }

    private static String getStrOut(String a, int b) {

        return a.substring(0, (a.length() - (a.length() - b)));
    }

    private static String getPasswordWithWantedLength(int a) {

        String passwordPartOne = "", passwordPartTwo = "", passwordPartThree = "";

        for (int i = 0; i < a; i++) {
            passwordPartOne += generatePart(1);
            passwordPartTwo += generatePart(2);
            passwordPartThree += generatePart(3);
        }

        return passwordPartOne + passwordPartTwo + passwordPartThree;
    }

    private static String generatePart(int a) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String symbols = "!#$%&'()*+,./:;<=>?@[]^_`{|}~";
        String digits = "0123456789";
        String set = "";

        switch (a) {
            case 1:
                set = alphabet;
                break;
            case 2:
                set = symbols;
                break;
            case 3:
                set = digits;
                break;
            default:
                set = "";
        }

        int digitsLength = set.length();

        return "" + set.charAt(getRandomNumbersRange(digitsLength - 1));
    }

    private static int getRandomNumbersRange(int a) {

        int leftCorner = 0;

        return leftCorner + (int) (Math.random() * ((a - leftCorner) + 1));
    }

    public static String shuffleString(String a) {

        List<Character> characters = new ArrayList<Character>();

        for (char c : a.toCharArray()) {
            characters.add(c);
        }

        StringBuilder output = new StringBuilder(a.length());

        while (characters.size() != 0) {
            int randPicker = (int) (Math.random() * characters.size());
            output.append(characters.remove(randPicker));
        }

        return output.toString();
    }
}
