package day003.hw3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class DollarToEuroExchanger {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        double exchangeRate = 1.21;    // fixed $ to € currency exchange rate

        System.out.println("Program for calculating the value of the dollar in euros.");
        System.out.print("Enter the value of your currency in dollar: ");

        double dollarValue = sc.nextDouble();

        euroValue(dollarValue, exchangeRate);
    }

    private static void euroValue(double dollarValue, double exchangeRate){
        double euroValue = dollarValue / exchangeRate;

        BigDecimal bd = new BigDecimal(euroValue);
        BigDecimal result1 = bd.setScale(2, RoundingMode.HALF_DOWN);

        System.out.println("Value of the " + dollarValue + "$ in euros is: " + result1 + "€.");
    }
}
