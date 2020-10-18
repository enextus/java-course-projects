package day004;

public class Circumference {
    public static void main(String[] args){
        double radius = 10;
        System.out.println(findCF(radius));
    }

    private static double findCF(double myRadius) {
        return 2 * Math.PI * myRadius;
    }
}

