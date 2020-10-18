package day009;

public class ClassWorkForTwo {
    public static void main(String[] args) {
        //

        System.out.println(sum(2, 4));
    }

    private static int sum(int a, int b) {
        //

        int result = 0;

        for (int i = a; i <= b; i++) {
            result += i;
            System.out.println("Temp: " + result);
        }
        return result;
    }
}
