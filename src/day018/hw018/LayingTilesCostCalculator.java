package day018.hw018;

import java.util.Scanner;

public class LayingTilesCostCalculator {

    /**
     * Master tiler Sergei are often asked the same question.
     * How much will it cost to lay tiles on a certain area.
     * *
     * - We know that he puts in about one square meter of tiles per hour.
     * - His hour costs 27 € excluding VAT.
     * - Standard tiles are 30 by 20 centimeters.
     * *
     * Sergei turned to us for help and you need to write a program for him.
     * Which will take the dimensions of the wall / floor,
     * the cost of the tiles and give out:
     * *
     * - The number of tiles required, both whole and those to be cut.
     * Please note that tiles can be laid both along and across,
     * and only on the spot will the master know exactly how to lay it;
     * - Material cost;
     * - Labor time cost;
     * - Final estimated cost;
     * *
     * Test:
     * Размеры рабочей поверхности: 600x200 cm.
     * Размеры плитки: 30x20 cm.
     * *
     * Status:
     * (1) Альбомная ориентация; В длинну и по высоте без остатка.
     * Общее кол-во плиток: 200.0
     * Цена плиток: 1000 €
     * Цена работы: 324.0 €
     * Общая сто-ть: 1324.0 €
     * *
     * Status:
     * (6) Портретная ориентация; В длинну без остатка, по высоте с остатком.
     * Общее кол-во плиток: 210.0
     * Цена плиток: 1050
     * Цена работы: 340.2 €
     * Общая сто-ть: 1390.2 €
     */

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        displayMessageHello();

        int performance = 1; // 1 m²/hour
        int hourlyRate = 27; // 27€/hour
        int oneTilePrice = 5; // 5€/Unit

        int partLength = 0;
        int partHeight = 0;

        int tileLength = 30; // cm
        int tileHeight = 20; // cm

        do {

            partLength = ((partLength = getInput(1)) > 0) ? partLength : getInput(1);
            partHeight = ((partHeight = getInput(2)) > 0) ? partHeight : getInput(2);

        } while (partLength <= 0 || partHeight <= 0);

        // Data seed
        // int partLength = 600; // cm
        // int partHeight = 200; // cm

        int pl = partLength;
        int tl = tileLength;

        int ph = partHeight;
        int th = tileHeight;

        displayMessageDimensions(partLength, partHeight, tileLength, tileHeight);

        displayMessageAboutStatus(getFitStatusOfLTile(pl, tl, ph, th));

        double numberOfLTiles = getNumberOfTiles(getFitStatusOfLTile(pl, tl, ph, th), pl, tl, ph, th);

        System.out.println("Общее кол-во плиток: " + (int) numberOfLTiles);
        System.out.println("Цена плиток: " + getTilesPrice(oneTilePrice, numberOfLTiles) + " €");
        System.out.println("Цена работы: " + getLaborPrice(numberOfLTiles, hourlyRate, tileLength, tileHeight, performance) + " €");
        System.out.println("Общая стоимость: " + getBill(getTilesPrice(oneTilePrice, numberOfLTiles),
                getLaborPrice(numberOfLTiles, hourlyRate, tileLength, tileHeight, performance)) + " €");

        displayMessageAboutStatus(getFitStatusOfPTile(pl, th, ph, tl));

        double numberOfPTiles = getNumberOfTiles(getFitStatusOfPTile(pl, th, ph, tl), pl, th, ph, tl);

        System.out.println("Общее кол-во плиток: " + (int) numberOfPTiles);
        System.out.println("Цена плиток: " + getTilesPrice(oneTilePrice, numberOfPTiles));
        System.out.println("Цена работы: " + getLaborPrice(numberOfPTiles, hourlyRate, tileLength, tileHeight, performance) + " €");
        System.out.println("Общая стоимость: " + getBill(getTilesPrice(oneTilePrice, numberOfPTiles),
                getLaborPrice(numberOfPTiles, hourlyRate, tileLength, tileHeight, performance)) + " €");

        input.close();
    }

    private static int getInput(int a) {

        String result = (a == 1) ? "д л и н н у " : "ш и р и н у";
        System.out.print("Пожалуйста введите " + result + " рабочей области в см (в целых числах): ");

        return input.nextInt();
    }

    private static void displayMessageHello() {

        System.out.println("Программа для расчета стоимости укладки плитки на поверхность заданного размера.");
    }

    private static double getBill(double a, double b) {

        return a + b;
    }

    private static double getLaborPrice(double a, int b, int c, int d, double e) {

        return (((double) c * (double) d) / 10000) * a * (double) b * e;
    }

    private static int getTilesPrice(int a, double b) {

        return a * (int) b;
    }

    private static double getNumberOfTiles(int a, int pl, int tl, int ph, int th) {

        double result;

        switch (a) {
            case 1:
            case 5:
                result = (pl / tl) * (ph / th);
                break;
            case 2:
            case 6:
                result = ((pl / tl) * Math.ceil((double) ph / th));
                break;
            case 3:
            case 7:
                result = (Math.ceil(((double) pl / tl)) * (ph / th));
                break;
            case 4:
            case 8:
                result = (Math.ceil(((double) pl / tl)) * Math.ceil((double) ph / th));
                break;
            default:
                result = 0;
                break;
        }

        return result;
    }

    private static void displayMessageDimensions(int a, int b, int c, int d) {

        System.out.println("\nРазмеры рабочей поверхности: " + a + "x" + b + " cm.");
        System.out.println("Размеры плитки: " + c + "x" + d + " cm.");
    }

    private static void displayMessageAboutStatus(int a) {

        System.out.println("\nСообщение о статусе системы:");

        switch (a) {
            case 1:
                System.out.println("(" + a + ") Альбомная ориентация; В длинну и по высоте без остатка.");
                break;
            case 2:
                System.out.println("(" + a + ") Альбомная ориентация; В длинну без остатка, по высоте с остатком.");
                break;
            case 3:
                System.out.println("(" + a + ") Альбомная ориентация; В длинну с остатком, по высоте без остатка.");
                break;
            case 4:
                System.out.println("(" + a + ") Альбомная ориентация; В длинну и по высоте с остатком.");
                break;
            case 5:
                System.out.println("(" + a + ") Портретная ориентация; В длинну и по высоте без остатка.");
                break;
            case 6:
                System.out.println("(" + a + ") Портретная ориентация; В длинну без остатка, по высоте с остатком.");
                break;
            case 7:
                System.out.println("(" + a + ") Портретная ориентация; В длинну с остатком, по высоте без остатка.");
                break;
            case 8:
                System.out.println("(" + a + ") Портретная ориентация; В длинну и по высоте с остатком.");
                break;
            default:
                System.out.println("Illegal input");
                break;
        }
    }

    private static int getFitStatusOfLTile(int a, int b, int c, int d) {

        if (a % b == 0) {   // в длинну без остатка (===)
            if (c % d == 0) {
                return 1;
            } else {
                return 2;
            }
        } else {            // в длинну с остатком (===+)
            if (c % d == 0) {
                return 3;
            } else {
                return 4;
            }
        }
    }

    private static int getFitStatusOfPTile(int a, int b, int c, int d) {

        if (a % b == 0) {   // в длинну без остатка (HHH)
            if (c % d == 0) {
                return 5;
            } else {
                return 6;
            }
        } else {            // в длинну с остатком (HHH+)
            if (c % d == 0) {
                return 7;
            } else {
                return 8;
            }
        }
    }
}
