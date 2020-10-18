package day009.hw9;

public class EnglishLettersPrintToLinesInTetrads {
    /**
     * Letters in a line
     * Print each letter of the American alphabet from A-Z to 4 letters per line.
     */

    public static void main(String[] args) {
        int counter = 0;

        for (char character = 'A'; character <= 'Z'; character++) {

            System.out.print(character);
            counter += 1;

            if (counter % 4 == 0) System.out.print("\n");
        }
    }
}
