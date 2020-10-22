package day033.hw033;

import java.util.Scanner;
import java.text.NumberFormat;

public class TheTowersOfHanoi {

    /**
     * The Towers of Hanoi - one of possible  solution
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
     * or on an empty rod.
     * *
     * With 3 disks, the puzzle can be solved in 7 moves. The minimal number of moves required to solve
     * a Tower of Hanoi puzzle is 2^n – 1, where n is the number of disks.
     * For example, a stack of 20 disks will require 2^20 – 1 moves;
     */

    private static int counter;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int disksAmount;

        do {
            System.out.print("How many disks do you have? (Input zero (0) to stop the program): ");
            disksAmount = scanner.nextInt();

            if (disksAmount != 0) {
                counter = 0;

                System.out.println(nextIteration(disksAmount, 1, 3));
            }

        } while (disksAmount != 0);
    }

    public static String nextIteration(int disksAmount, int startPeg, int endPeg) {

        if (disksAmount == 1) {
            counter++;

            return (counter + ": " + startPeg + " -> " + endPeg + "\n");
        }

        int tempPeg = 6 - startPeg - endPeg;

        String firstSteps = nextIteration(disksAmount - 1, startPeg, tempPeg);
        counter++;

        String thisStep = (counter + ": " + startPeg + " -> " + endPeg + "\n");
        String lastSteps = nextIteration(disksAmount - 1, tempPeg, endPeg);

        return (firstSteps + thisStep + lastSteps);
    }
}
