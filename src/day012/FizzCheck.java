package day012;

public class FizzCheck {
    /**
     * Given a string str, if the string starts with "f" return "Fizz".
     * *
     * If the string ends with "b" return "Buzz".
     * If both the "f" and "b" conditions are true, return "FizzBuzz".
     * <p>
     * In all other cases, return the string unchanged.
     * <p>
     * (See also: FizzBuzz Code)
     * *
     * fizzString("fig") → "Fizz"
     * fizzString("dib") → "Buzz"
     * fizzString("fib") → "FizzBuzz"
     */

    public static void main(String[] args) {

        String str = "";

        System.out.println("fig: " + fizzString("fig"));
        System.out.println("dib: " + fizzString("dib"));
        System.out.println("fib: " + fizzString("fib"));

    }

    private static String fizzString(String str) {

        if (str.endsWith("b") && str.startsWith("f")) return "FizzBuzz";
        if (str.startsWith("f")) return "Fizz";
        if (str.endsWith("b")) return "Buzz";

        return "";
        
    }

}
