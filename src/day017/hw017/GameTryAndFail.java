package day017.hw017;

import java.util.Scanner;

public class GameTryAndFail {

    /**
     * The computer thinks out a number from 1 to n.
     * The user has k attempts to guess.
     * After each unsuccessful attempt, the computer reports less or more the hidden number.
     * At the end of the game, the text with the result (either “You guessed right” or “Attempts ended”).
     *
     * Test:
     * Please enter the maximal possible number: 12
     * Please enter the maximum number of attempts: 4
     * You have 4 attempts.
     * Attempt: 1, you have 3 attempts.
     * Please enter your guessed number: 2
     * Too low!
     * Attempt: 2, you have 2 attempts.
     * Please enter your guessed number: 10
     * Bit much!
     * Attempt: 3, you have 1 attempts.
     * Please enter your guessed number: 7
     * Bit much!
     * Attempt: 4, you have 0 attempts.
     * Please enter your guessed number: 5
     * Your have right! The secret number is 5
     */

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Please enter the maximal possible number: ");
        int n = input.nextInt();

        System.out.print("Please enter the maximum number of attempts: ");
        int k = input.nextInt();

        int secretNumber = getRandomNumbersRange(n);

        System.out.println("You have " + k + " attempts.");

        for (int i = 1; i <= k; i++) {

            System.out.println("Attempt: " + i + ", you have " + (k - i) + " attempts.");

            System.out.print("Please enter your guessed number: ");
            int guessedNumber = input.nextInt();

            if (guessedNumber == secretNumber) {

                System.out.println("Your have right! The secret number is " + secretNumber);
                break;
            }

            if (guessedNumber > secretNumber) System.out.println("Bit much!");
            else System.out.println("Too low!");

            if (i == k) System.out.println("The attempts ended.");
        }

        input.close();
    }

    private static int getRandomNumbersRange(int a) {

        int leftCorner = 1;

        return leftCorner + (int) (Math.random() * ((a - leftCorner) + 1));
    }
}
