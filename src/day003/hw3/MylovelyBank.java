package day003.hw3;

public class MylovelyBank {
    public static void main(String[] args){
        int customerYear = 15;

        bankAccount( 1000, customerYear,  3.5);
    }

    private static void bankAccount(double money, int year, double interest){
        double result = interest * year * money / 100 + money;

        System.out.println(result);
    }
}

