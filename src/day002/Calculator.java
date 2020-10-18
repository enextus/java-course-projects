package day002;

public class Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 11;
        addition(a, b);
        multiplication();
    }

    public static void addition(int a, int b) {
/*        int a = 5;
        int b = 10;*/
        System.out.println("Сложение: " + (a + b));
    }

    public static void multiplication() {
        int a = 5;
        int b = 10;
        System.out.println("Произведение: " + a * b);
    }


    public static void intIntroduction() {
        // System.out.println(2 * 5);
        int a = 2;
        int b = 6;
        int c = a + b;
        System.out.println("Дорогой компьютер, распечатай мне значение c: " + c);
        int money = 900;
        int iphoneCost = 1000;
        System.out.println("Количество айфонов, которые я могу купить " + money / iphoneCost);
    }
}
