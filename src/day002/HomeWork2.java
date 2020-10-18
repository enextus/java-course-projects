package day002;

public class HomeWork2 {
    public static void main(String[] args) {
        // 1.
        // 2.
        // 3.
        // 4.
        int firstSide = 10;
        int secondSide = 20;
        findRectangleSquare(firstSide, secondSide);

        int firstSideOther = 100;
        int secondSideOther = 200;
        findRectangleSquare(firstSideOther, secondSideOther);

        int firstSideOther01 = 100;
        int secondSideOther02 = 200;
        findRectanglePerimeter(firstSideOther01, secondSideOther02);

        int firstSideOther03 = 100;
        findSquareCube(firstSideOther03);

    }

    private static void findRectangleSquare(int a, int b) {
        System.out.println("Wenn die erste Seite " + a + " und die zweite Seite " + b + " dann ist die gesuchte Fläche: " + a * b);
    }

    private static void findRectanglePerimeter(int a, int b) {
        System.out.println("Wenn die erste Seite " + a + " und die zweite Seite " + b + " dann ist die gesuchte Perimeter: " + 2 * (a + b));
    }

    private static void findSquareCube(int a) {
        System.out.println("Wenn die Seite " + a + " dann ist die gesuchte Fläche: " + 6 * a * a);
    }
}
