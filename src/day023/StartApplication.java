package day023;

public class StartApplication {

    /**
     * 64 + 32 + 0 + 0 + 0 + 2 + 1 = 99.
     * This is the decimal equivalent of the binary number 1100011.
     */

    public static void main(String[] args) {

        int decimalNumber = 99;

        String resultBinary = "";
        
        System.out.println("Result: " + Converter.converterDecimalToBinaryRecursion(decimalNumber, resultBinary));
    }
}
