package day026;

import java.util.Scanner;

public class myWhileTrueWhitBreak {

    public static void main(String[] args) {

        double number, sum, test, test2;

        sum = 0.0;

        Scanner input = new Scanner(System.in);

        while (true){

            System.out.println("Enter a number: ");
            number = input.nextDouble();

            if (number < 0.0) {

                break;
            }

            sum *= number;
        }
        System.out.println("Sum = " + sum);
    }
}
