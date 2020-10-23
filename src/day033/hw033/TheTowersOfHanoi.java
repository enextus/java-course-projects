package day033.hw033;

import java.util.Scanner;

public class TheTowersOfHanoi {

    /**
     * The Towers of Hanoi is one of the possible particular solutions.
     *
     * The Tower of Hanoi (also called the Tower of Brahma or Lucas' Tower[1] and sometimes pluralized as Towers)
     * is a mathematical game or puzzle. It consists of three rods and a number of disks of different sizes,
     * which can slide onto any rod. The puzzle starts with the disks in a neat stack in ascending order of size
     * on one rod, the smallest at the top, thus making a conical shape.
     * *
     * The objective of the puzzle is to move the entire stack to another rod, obeying the following simple rules:
     * *
     * - Only one disk can be moved at a time.
     * - No larger disk may be placed on top of a smaller disk.
     * - Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack
     *   or on an empty rod.
     * *
     * With 3 disks, the puzzle can be solved in 7 moves. The minimal number of moves required to solve
     * a Tower of Hanoi puzzle is 2^n – 1, where n is the number of disks.
     * For example, a stack of 20 disks will require 2^20 – 1 moves;
     *
     * Test:
     * How many disks do you have? (Input zero (0) to stop the program): 3
     * 1: 1 -> 3
     * 2: 1 -> 2
     * 3: 3 -> 2
     * 4: 1 -> 3
     * 5: 2 -> 1
     * 6: 2 -> 3
     * 7: 1 -> 3
     *
     * Exception:
     * How many disks do you have? (Input zero (0) to stop the program): 27
     * Exception in thread "main" java.lang.OutOfMemoryError: Overflow: String length out of range
     * 	at java.base/java.lang.StringConcatHelper.checkOverflow(StringConcatHelper.java:53)
     * 	at java.base/java.lang.StringConcatHelper.mix(StringConcatHelper.java:134)
     * 	at day033.hw033.TheTowersOfHanoi.nextIteration(TheTowersOfHanoi.java:72)
     * 	at day033.hw033.TheTowersOfHanoi.main(TheTowersOfHanoi.java:50)
     */

    private static int iterationCounter;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int disksAmount;

        do {
            System.out.print("How many disks do you have? (Maximum number of disks is 26; Input 0 to stop the program!): ");
            disksAmount = scanner.nextInt();

            if (disksAmount > 0 && disksAmount < 27) {
                iterationCounter = 0;

                System.out.println(nextIteration(disksAmount, 1, 3));
            }

        } while (disksAmount != 0);
    }

    public static String nextIteration(int disksAmount, int startHolder, int endHolder) {

        if (disksAmount == 1) {
            iterationCounter++;

            return (iterationCounter + ": " + startHolder + " -> " + endHolder + "\n");
        }

        int tempHolder = 6 - startHolder - endHolder;

        String firstSteps = nextIteration(disksAmount - 1, startHolder, tempHolder);
        iterationCounter++;

        String thisStep = (iterationCounter + ": " + startHolder + " -> " + endHolder + "\n");

        String lastSteps = nextIteration(disksAmount - 1, tempHolder, endHolder);

        return (firstSteps + thisStep + lastSteps);
    }
}
