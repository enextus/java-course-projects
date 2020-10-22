package day010.hw10;

public class FindMultiplesOfElevenNumbersBetweenTwoNumbers {

    /**
     * Write a program that finds multiples of 11 between a and b.
     */

    public static void main(String[] args) {

        // int a = -11; // start with number witch multiple of eleven - end with other
        // int b = 18; // List of multiples of eleven between -11 and 18: -11, 0, 11;

        // int a = -13; // start with number witch no multiple of eleven - end with multiple of eleven
        // int b = 22; // List of multiples of eleven between -13 and 22: -11, 0, 11, 22;

        // int a = -18; // start with number witch no multiple of eleven - end with multiple of eleven
        // int b = 11; // List of multiples of eleven between -18 and 11: -11, 0, 11;

        int a = -11; // start with number witch multiple of eleven - end with other
        int b = 13; // List of multiples of eleven between -11 and 13: -11, 0, 11;

        // int a = 11; // both equal and multiples of eleven
        // int b = 11; // List of even numbers between 10 and 10: 10;

        // int a = 5; // both equal and not multiples of eleven
        // int b = 5; // List of multiples of eleven between 5 and 5: None;

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.print("List of multiples of eleven between " + a + " and " + b + ": ");

        for (int i = a; i <= b; i++) {

            if (checkMultiplicityOfElen(i) && i > a + 10) System.out.print(", ");
            if (checkMultiplicityOfElen(i)) System.out.print(i);
            if (a == b && !checkMultiplicityOfElen(i)) System.out.print("None");
            if (i == b) System.out.print(";");
        }
    }

    private static boolean checkMultiplicityOfElen(int a) {

        return a % 11 == 0;
    }
}
