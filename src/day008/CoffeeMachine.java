package day008;

public class CoffeeMachine {

    public static void latte() {
        int ml = 40;
        double dblTotal = 50.78;
        int intValue = 66;

        String stringVal = "45";

        System.out.println("------------------------------------");
        // System.out.printf("Added %ml of latte");
        System.out.println(ml);
        // System.out.printf("Hello %s!%n %ml", "World");

        System.out.printf("Total is: $%,.2f%n", dblTotal);
        System.out.printf("Total: %-10.2f: ", dblTotal);
        System.out.printf("% 4d", intValue);
        System.out.printf("%20.10s\n", stringVal);
        String s = "Hello World";
        System.out.printf("The String object %s is at hash code %h%n", s, s);

        System.out.println("------------------------------------");

    }

    public static void americano() {
        int ml = 40;
        System.out.printf("Added %ml of americano \n");

        System.out.printf("Hello %s!%n", "World");

    }

    public static void cappucino() {
        int ml = 40;
        System.out.printf("Added %ml of cappucino \n");

        System.out.printf("Hello %s!%n", "World");

    }

    public static void milk() {
        int ml = 40;
        System.out.printf("Added %ml of milk \n");

        System.out.printf("Hello %s!%n", "World");

    }

    public static void coffee() {
        int ml = 40;
        System.out.printf("Added %ml of coffee \n");

        System.out.printf("Hello %s!%n", "World");

    }
}

