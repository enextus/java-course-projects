package day010.hw10;

public class FindEvenNumbersBetweenTwoNumbers {

    /**
     * Write a program that finds even numbers between a and b.
     */

    public static void main(String[] args) {

        // int a = -8; // start with even - end with odd
        // int b = 17; // List of even numbers between -8 and 17: -8, -6, -4, -2, 0, 2, 4, 6, 8, 10, 12, 14, 16;

        // int a = -8; // start with even - end with even
        // int b = 18; // List of even numbers between -8 and 18: -8, -6, -4, -2, 0, 2, 4, 6, 8, 10, 12, 14, 16, 18;

        // int a = -7; // start with odd - end with odd
        // int b = 17; // List of even numbers between -7 and 17: -6, -4, -2, 0, 2, 4, 6, 8, 10, 12, 14, 16;

        // int a = -7; // start with odd - end with even
        // int b = 18; // List of even numbers between -7 and 18: -6, -4, -2, 0, 2, 4, 6, 8, 10, 12, 14, 16, 18;

        // nt a = 10; // both equal and even
        // int b = 10; // List of even numbers between 10 and 10: 10;

        int a = 7; // both equal and odd
        int b = 7; // List of even numbers between 7 and 7: None;

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.print("List of even numbers between " + a + " and " + b + ": ");

        for (int i = a; i <= b; i++) {

            if (checkEven(i) && i > a + 1) System.out.print(", ");
            if (checkEven(i)) System.out.print(i);
            if (a == b && !checkEven(i)) System.out.print("None");
            if (i == b) System.out.print(";");
        }
    }

    private static boolean checkEven(int a) {
        return a % 2 == 0;
    }
}
