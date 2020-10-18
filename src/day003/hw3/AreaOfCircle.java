package day003.hw3;

import java.util.Scanner;

public class AreaOfCircle {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Program for calculation of area of circle.");
        System.out.print("Please enter the radius of your circle in centimeters: ");

        double radius = sc.nextDouble();

        areaOfCircle(radius);
    }

    private static void areaOfCircle(double radius){
        double areaOfCircle = Math.PI * Math.pow(radius, 2);

        System.out.println("Area of circle of radius " + radius + " cm" + " is: " + areaOfCircle + " cm².");
    }
}
