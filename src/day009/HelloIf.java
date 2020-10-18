package day009;

public class HelloIf {
    public static void main(String[] args) {
        ifIntroductionThree();
    }

    private static void ifIntroductionThree() {
        int age = 15;

        if (age < 16) System.out.println("Denided");
        else if (age >= 16 && age < 18) System.out.println("Beer allowed!");
        else System.out.println();
    }
}
