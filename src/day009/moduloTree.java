package day009;

public class moduloTree {
    public static void main(String[] args) {
        /* output all values between 0 and 100 witch divided trow 7 without .x */
        for (int i = 1; i < 100; i++) {
            if (i % 7 == 0) {
                System.out.println("i = " + i);
            }

        }
    }
}

