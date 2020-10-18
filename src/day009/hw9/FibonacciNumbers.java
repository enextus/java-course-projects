package day009.hw9;

public class FibonacciNumbers {
    /**
     * Fibonacci series.
     * Display the first 11 terms of the Fibonacci sequence.
     * M[n] = fib(n - 1) + fib(n - 2)
     */

    public static void main(String[] args) {

        int numberOfElements = 11;

        for (int i = 1; i <= numberOfElements; i++) {
            System.out.println(fibonacciGenerate(i));
        }
    }

    public static int fibonacciGenerate(int x) {

        if (x == 0 || x == 1) return x;

        return fibonacciGenerate(x - 1) + fibonacciGenerate(x - 2);
    }
}
