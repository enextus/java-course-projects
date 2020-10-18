package day005;

public class ClassWork {
    public static void main(String[] args) {
        //String s1 = "Andrej";

        //System.out.println(helloName(s1));
        //System.out.println(helloName(s1));

        System.out.println("Brutto Preis: " + pirogiPreis(3) + " €");


    }

    public static double pirogiPreis(double nettoPreis) {
        double mwst = 5;
        double result = nettoPreis * mwst/100 + nettoPreis;

        return result;
    }

    private static String helloName(String userName) {

        return "Hello" + userName;
    }
}
