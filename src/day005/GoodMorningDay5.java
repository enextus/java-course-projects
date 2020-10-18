package day005;

public class GoodMorningDay5 {
    public static void main(String[] args) {
        myFirstMethode();
        myThirdMethode();
    }

    public static void myFirstMethode() {
        System.out.println("1");

        mySecondMethode();
    }

    public static void mySecondMethode() {
        System.out.println("2");

        myThirdMethode();
    }

    public static void myThirdMethode() {
        System.out.println("3");
    }
}
