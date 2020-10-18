package day007;

public class ClassWork {
    public static void main(String[] args) {
        reviewString();
    }

    public static void reviewString () {
        String number = "00000000012";

        int newVeryModernDigit = Integer.parseInt(number); //  parsing a Char in to a digit
        System.out.println(newVeryModernDigit);
    }
}
