package day023;

public class Converter {

    /**
     * Converter Decimal to Binary
     */

    public static String converterDecimalToBinary(int numberDecimal) {

        String resultBinary = "";

        while (numberDecimal > 0) {

            int remainder;

            remainder = numberDecimal % 2;

            resultBinary = remainder + resultBinary;
            
            numberDecimal = numberDecimal / 2;
        }

        return resultBinary;
    }

    public static String converterDecimalToBinaryRecursion(int numberDecimal, String resultBinary) {

        if (numberDecimal == 0) return resultBinary;

        resultBinary += numberDecimal % 2;

        return converterDecimalToBinaryRecursion(numberDecimal / 2, resultBinary);
    }
}
