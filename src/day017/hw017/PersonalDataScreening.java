package day017.hw017;

import java.util.Scanner;

public class PersonalDataScreening {

    /**
     * Write a program to introduce yourself.
     * The data that the car asks for: name, surname, gender, age, email.
     * To read String data, use the next() method: input.next()
     *
     * Test:
     * Please enter your name: Ed
     * Please enter your surname: Park
     * Please enter your gender: male
     * Please enter your age: 51
     * Please enter your email: sdfsdfs@sdfsdf.de
     * Hello Ed, Park! You are 51 years old, male. Your email is sdfsdfs@sdfsdf.de
     */

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Please enter your name: ");
        String name = input.next();

        System.out.print("Please enter your surname: ");
        String surname = input.next();

        System.out.print("Please enter your gender: ");
        String gender = input.next();

        System.out.print("Please enter your age: ");
        int age = input.nextInt();

        System.out.print("Please enter your email: ");
        String email = input.next();

        System.out.println("Hello " + name + ", " + surname + "! " + "You are " + age + " years old, " + gender + ". Your email is " + email);

        input.close();
    }
}
