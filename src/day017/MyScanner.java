package day017;

import java.util.Scanner;

public class MyScanner {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Please enter the radius of your alter in centimeters: ");
        int age = input.nextInt();

        System.out.print("Please enter the radius of your alter in centimeters: ");
        String name = input.next();

        System.out.print("Please enter the agree: ");
        boolean agree = input.nextBoolean();

        checkAge(age, name, agree);

        input.close();
    }

    private static void checkAge(int a, String b, boolean c) {

        System.out.println("Area of circle of radius " + a);
        System.out.println("Area of circle of radius " + b);
        System.out.println("Area of circle of radius " + c);
    }
}
