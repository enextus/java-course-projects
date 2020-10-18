package day016.hw016;

public class CaesarCodeMachine {

    /**
     * Design a encryption machine for the firm's new client, Guy Julius Caesar.
     * The client came up with an encryption algorithm and wants us to implement it in the method.
     * Method execution example: enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю.")
     * wanted text: "Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб."
     *
     * Test:
     * "Съешь же ещё этих мягких французских булок, да выпей чаю."  // input text
     * "Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб."  // coded text
     * "Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб."  // wanted text
     */

    public static void main(String[] args) {

        String textToCode = "Съешь же ещё этих мягких французских булок, да выпей чаю.";
        String codedText = "";

        System.out.println("Text to code: " + textToCode);
        System.out.print("> Coded text: " + enigmaCaesar(textToCode, codedText));
    }

    private static String enigmaCaesar(String a, String b) {

        for (int i = 0; i < a.length(); i++) {
            b += getCodedChar(a.charAt(i));
        }

        return b;
    }

    private static char getCodedChar(int a) {

        if (a == 32 || a == 44 || a == 46) return (char) a; // " " , .
        else if (a == 1075) return (char) (a + 30); // г
        else if (a == 1076 || a == 1077) return (char) (a + 2); // д, е
        else if (a == 1101 || a == 1102 || a == 1103) return (char) ((a - 31) + 2); // э, ю, р
        else if (a == 1105) return (char) ((a - 31) + 6); // ё
        else return (char) (a + 3);
    }
}
