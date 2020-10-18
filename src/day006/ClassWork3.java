package day006;

public class ClassWork3 {

    public static void main(String[] args) {
        String userName = "WooHoo";

        System.out.println(firstHalf(userName));
    }

    public static String firstHalf(String userName) {
        int lengthOur = userName.length()/2;

        String halfWord = userName.substring(0, lengthOur);

        return halfWord;
    }
}
