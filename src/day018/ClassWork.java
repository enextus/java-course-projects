package day018;

public class ClassWork {

    public static void main(String[] args) {

        double diameterSputnik = 58;
        double squareSputnik = getSquareOfSputnik(diameterSputnik);
        System.out.println(squareSputnik);

        double sideOfCube = 40;
        double squareCube = getSquareOfCube(sideOfCube);
        System.out.println(squareCube);

        double sideOfBaseOfRegularQuadrangular = 20;
        double lateralRibs = 30;
        double squareQuadrangular = getSquareOfQuadrangular(sideOfBaseOfRegularQuadrangular, lateralRibs);
        System.out.println(squareQuadrangular);

        double sideOneOfBox = 80;
        double sideTwoOfBox = 30;
        double sideThreeOfBox = 20;
        double squareBox = getSquareOfBox(sideOneOfBox, sideTwoOfBox, sideThreeOfBox);
        System.out.println(squareBox);
    }

    private static double getSquareOfBox(double a, double b, double c) {
        return 2 * ((a * b) + (b * c) + (a * c));
    }

    private static double getSquareOfQuadrangular(double a, double b) {
        return (b * Math.sqrt(a * a - ((b * b) / 4))) / 2;
    }

    private static double getSquareOfCube(double a) {
        return 6 * a * a;
    }

    private static double getSquareOfSputnik(double a) {
        return (4 * Math.PI * (a / 2) * (a / 2));
    }
}
