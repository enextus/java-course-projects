package day010.hw10;

public class FindPrimeNumbersBetweenTwoNumbers {

    /**
     * A prime number (or a prime) is a natural number greater than 1 that is not a product of two smaller natural numbers.
     * A natural number greater than 1 that is not prime is called a composite number.
     * <p>
     * Write a program that finds prime numbers between a and b.
     */

    public static void main(String[] args) {

        // int a = 2;
        // int b = 3; // List of prime numbers between 2 and 3: 2; 3;

        int a = 24;
        int b = 33; // List of prime numbers between 24 and 33: 29; 31;

        // int a = 1;
        // int b = 1; // List of prime numbers between 1 and 1: None

        // int a = -100;
        // int b = 1; // List of prime numbers between -100 and 1: None

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.print("List of prime numbers between " + a + " and " + b + ": ");

        for (int i = a; i <= b; i++) {

            if (checkPrime(i))
                System.out.print(i + "; ");

            if (i == b && i < 2 && !checkPrime(i))
                System.out.print("None");
        }
    }

    private static boolean checkPrime(int n) {
        if (n <= 1)
            return false; // corner return with false

        for (int i = 2; i < n; i++) { // check the following range 2 to n-1
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
