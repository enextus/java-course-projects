package day004;

public class DoubleReview {
    public static void main(String[] args){
        double pi = Math.PI;
        System.out.println("PI: " + pi);

        myLovelyRound(pi);
    }

    private static void myLovelyRound(double number){
        double result = 0.0;
        int k = 100;

        double temp = number * k;
        System.out.println("1: " + temp); // 314.1592653589793

        int temp2 = (int) temp; // automatische Typen - umwandlung
        System.out.println("2: " + temp2/100); // 3

        result = temp2;
        System.out.println("3: " + result); // 314.0

        result = result / k;
        System.out.println("4: " + result); // 3.14
    }
}
