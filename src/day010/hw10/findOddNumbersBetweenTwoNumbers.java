package day010.hw10;

public class findOddNumbersBetweenTwoNumbers {

    /**
     * Write a program that finds odd numbers between a and b.
     */

    public static void main(String[] args) {

        int a = -8; // start with even - end with odd
        int b = 17; // List of odd numbers between -8 and 17: -7, -5, -3, -1, 1, 3, 5, 7, 9, 11, 13, 15, 17;

        // int a = -8; // start with even - end with even
        // int b = 18; // List of odd numbers between -8 and 18: -7, -5, -3, -1, 1, 3, 5, 7, 9, 11, 13, 15, 17;

        // int a = -7; // start with odd - end with odd
        // int b = 17; // List of odd numbers between -7 and 17: -7, -5, -3, -1, 1, 3, 5, 7, 9, 11, 13, 15, 17;

        // int a = -7; // start with odd - end with even
        // int b = 18; // List of odd numbers between -7 and 18: -7, -5, -3, -1, 1, 3, 5, 7, 9, 11, 13, 15, 17;

        // int a = 10; // both equal and even
        // int b = 10; // List of odd numbers between 10 and 10: None;

        // int a = 7; // both equal and odd
        // int b = 7; // List of odd numbers between 7 and 7: 7;

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.print("List of odd numbers between " + a + " and " + b + ": ");

        for (int i = a; i <= b; i++) {

            if (checkOdd(i) && i > a + 1) System.out.print(", ");
            if (checkOdd(i)) System.out.print(i);
            if (a == b && !checkOdd(i)) System.out.print("None");
            if (i == b) System.out.print(";");
        }
    }

    private static boolean checkOdd(int a) {
        return a % 2 != 0;
    }
}
