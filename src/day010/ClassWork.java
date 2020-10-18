package day010;

public class ClassWork {
    public static void main(String[] args) {


        // 0 - 100, primzahlen

        int zahl = 99;

        issueFor(zahl);
    }

    private static void issueFor(int zahl) {
        for (int i = 0; i < 100; i++) {

            if (i % zahl == 0) System.out.println("i:" + i);

        }
    }
}
