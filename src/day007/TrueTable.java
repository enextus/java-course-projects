package day007;

public class TrueTable {
    public static void main(String[] args) {
        // ||, or

        boolean a = true;
        boolean b = true;
        System.out.println("a || b -> " + (a || b));

        boolean a1 = false;
        boolean b1 = false;
        System.out.println("a1 || b1 -> " + (a1 || b1));

        boolean a2 = true;
        boolean b2 = false;
        System.out.println("a2 || b2 -> " + (a2 || b2));

        boolean a3 = false;
        boolean b3 = true;
        System.out.println("a3 || b3 -> " + (a3 || b3));

        // &&, and

        boolean a4 = true;
        boolean b4 = true;
        System.out.println("a && b -> " + (a4 && b4));

        boolean a5 = false;
        boolean b5 = false;
        System.out.println("a5 && b5 -> " + (a5 && b5));

        boolean a6 = true;
        boolean b6 = false;
        System.out.println("a6 && b6 -> " + (a6 && b6));

        boolean a7 = false;
        boolean b7 = true;
        System.out.println("a7 && b7 -> " + (a7 && b7));

        // XOR

        boolean a8 = true;
        boolean b8 = true;
        System.out.println("a ^ b -> " + (a8 ^ b8));

        boolean a9 = false;
        boolean b9 = false;
        System.out.println("a9 ^ b9 -> " + (a9 ^ b9));

        boolean a10 = true;
        boolean b10 = false;
        System.out.println("a10 ^ b10 -> " + (a10 ^ b10));

        boolean a11 = false;
        boolean b11 = true;
        System.out.println("a11 ^ b11 -> " + (a11 ^ b11));


    }
}
