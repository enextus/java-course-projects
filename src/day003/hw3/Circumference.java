package day003.hw3;

import java.util.Scanner;

public class Circumference {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Program for calculation of circumference of circle.");
        System.out.print("Enter the radius of your circle in centimeters: ");

        double radius = sc.nextDouble();

        circumference(radius);
    }

    private static void circumference(double radius){
        double circumference = Math.PI * 2 * radius;

        System.out.println("Circumference of circle of radius " + radius + " cm" + " is: " + circumference + " cm.");
    }
}
