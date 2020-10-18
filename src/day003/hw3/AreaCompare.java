package day003.hw3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AreaCompare {
    public static void main(String[] args){
        double belarus = 207_595;
        double ukraine = 603_628;

        rate(belarus, ukraine);
    }

    private static void rate(double s1, double s2){
        double rate = s1 / s2;

        BigDecimal bd = new BigDecimal(rate);
        BigDecimal result1 = bd.setScale(2, RoundingMode.HALF_DOWN);

        System.out.println(result1);
    }
}
