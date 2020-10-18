package day004;

public class Calculator {
    public static void main(String[] args){
        addition1();
        int a = 100;
        int b = 200;

        addition2(a, b);

        int result = addition3(a, b);

        System.out.println(result);
    }
    private static void addition1() {
        //
    }

    private static void addition2(int a, int b) {
        //
    }

    private static int addition3(int a, int b) {
        int c = a + b;
        return c;
    }
}
