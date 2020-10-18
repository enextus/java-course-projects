package day016;

import java.util.Locale;

public class ClassWork01 {

    public static void main(String[] args) {

        String word01 = "Я люблю Ярославль!";
        String word02 = "Я люблю Берлин!";
        String word03 = "Я люблю тебя!";

        System.out.println(countYa(word01));
        System.out.println(countYa(word02));
        System.out.println(countYa(word03));
    }

    private static int countYa(String input) {

        // input = input.toLowerCase(Locale.forLanguageTag(input));

        System.out.println("Original input: " + input);

        input = input.toLowerCase(Locale.getDefault());

        System.out.println("Changed input: " + input);

        char ya = 'я';
        int count = 0;

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == ya) {
                count++;
            }
        }

        return count;
    }
}
