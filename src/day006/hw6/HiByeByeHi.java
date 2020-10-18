package day006.hw6;

public class HiByeByeHi {
    public static void main(String[] args) {

        String aOne = "Hi";
        String bOne = "Bye";

        System.out.println(makeAbba(aOne, bOne));

        String aTwo = "Yo";
        String bTwo = "Alice";

        System.out.println(makeAbba(aTwo, bTwo));

        String aThird = "What";
        String bThird = "Up";

        System.out.println(makeAbba(aThird, bThird));

    }

    private static String makeAbba(String a, String b) {
        String result = a + b + b + a;

        return result;
    }
}
